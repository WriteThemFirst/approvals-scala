import com.github.writethemfirst.Approbation
import com.github.writethemfirst.approvals.approvers.Approver
import org.scalatest.fixture.FlatSpec

class Demo extends FlatSpec with Approbation {
  it should "approve demo" in { approver: Approver =>
    approver.verify("demo")
  }
}
