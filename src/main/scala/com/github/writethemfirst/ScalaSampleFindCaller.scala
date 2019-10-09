package com.github.writethemfirst

import java.util.Optional

import com.github.writethemfirst.approvals.utils.stack.JavaDefaultFindCaller


class ScalaSampleFindCaller extends JavaDefaultFindCaller {

  override def callerClass(potentialReferenceClasses: Class[_]*): String = {
    println("hello from demo scala class")
    super.callerClass(potentialReferenceClasses: _*)
  }

  override def callerMethod(referenceClassName: String): Optional[String] = {
    println("hello from demo scala class")
    super.callerMethod(referenceClassName)
  }
}
