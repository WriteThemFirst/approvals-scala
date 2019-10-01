import com.github.writethemfirst.Approbation

class Demo extends Approbation {
  it should "approve demo" in { approver =>
    approver.verify("demo")
  }
}
