package com.github.writethemfirst

import java.util.Locale

import com.github.writethemfirst.approvals.approvers.Approver
import org.scalatest.{FixtureTestSuite, Outcome}
import pprint.PPrinter
import pprint.PPrinter.BlackWhite

trait Approbation {
  self: FixtureTestSuite =>

  // avoid serialization issues when workstation Locale differs from CI
  Locale.setDefault(new Locale("en", "US"))

  private val approvals  = (new Approver).testing(getClass)
  val prettify: PPrinter = BlackWhite.copy(defaultHeight = Int.MaxValue)

  override type FixtureParam = Approver

  // see https://stackoverflow.com/questions/14831246/access-scalatest-test-name-from-inside-test
  // and http://www.scalatest.org/user_guide/sharing_fixtures
  override def withFixture(test: OneArgTest): Outcome = {
    val approver = approvals.writeTo(test.name)
    withFixture(test.toNoArgTest(approver))
  }

}
