import cn.hyperchain.annotations.StoreField;
import cn.hyperchain.contract.BaseContract;
import cn.hyperchain.core.HyperList;
import cn.hyperchain.core.HyperMap;
import cn.hyperchain.core.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * HVM智能合约，是指运行在HVM执行环境当中的Java语言编写的智能合约。具有易编写，易运维，高效灵活的特点，目前是Hyperchain平台推荐的智能合约方案。
 * <p>
 * 合约需要集成BaseContract，建议一个项目中只有一个合约，称为合约主体类。
 *
 * @author blocface
 */
public class HelloWorld extends BaseContract implements HelloWorldInterface {
    @Override
    public String sayHello() {
        return "Hello World!";
    }
}
