import cn.hyperchain.contract.BaseInvoke;

/**
 * 保存数据，并查询该条数据
 *
 * @author blocface
 */
public class FrameworkInvoker implements BaseInvoke<MyData, FrameworkAdmin> {

    private MyData myData;

    public FrameworkInvoker() {
    }

    public FrameworkInvoker(MyData myData) {
        this.myData = myData;
    }

    @Override
    public MyData invoke(FrameworkAdmin frameworkAdmin) {
        frameworkAdmin.save(myData);
        return frameworkAdmin.query(myData.getId());
    }
}
