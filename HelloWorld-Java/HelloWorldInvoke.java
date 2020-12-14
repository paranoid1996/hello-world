import cn.hyperchain.contract.BaseInvoke;

import java.util.ArrayList;
import java.util.List;

/**
 * 合约调用类也称为InvokeBean，尽管其往往不包括在智能合约包当中，但是是智能合约调用过程当中不可或缺的部分。
 * <p>
 * InvokeBean是在应用代码当中编写的，不是在合约代码中编写。
 *
 * @author meshsec
 */
public class HelloWorldInvoke implements BaseInvoke<String, HelloWorldInterface> {

    public HelloWorldInvoke() {
    }

    @Override
    public String invoke(HelloWorldInterface contractInterface) {
        return contractInterface.sayHello();
    }
}
