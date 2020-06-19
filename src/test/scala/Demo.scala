import com.github.writethemfirst.Approbation
import com.github.writethemfirst.approvals.approvers.Approver
import org.scalatest.flatspec.FixtureAnyFlatSpec

class Demo extends FixtureAnyFlatSpec with Approbation {
  it should "approve demo" in { approver: Approver =>
    approver.verify("demo")
  }
}
