import cn.hyperchain.contract.BaseContractInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * HVM智能合约，是指运行在HVM执行环境当中的Java语言编写的智能合约。具有易编写，易运维，高效灵活的特点，目前是Hyperchain平台推荐的智能合约方案。
 * <p>
 * 合约主体类需要实现合约可见接口，合约可见接口是指继承了BaseContractInterface的接口，而BaseContractInterface是一个空接口，用户仅可以调用可见接口中所声明的方法。
 * 合约调用用户只需要在应用中得到可见接口即可，不需要得到合约代码的实现。这也比较适合合约开发团队和应用开发团队不是一个团队，或者是合约开发者希望只交付接口的场景。
 * 用户可以通过开放不同可见范围的接口，实现逻辑层面的权限控制。
 *
 * @author meshsec
 */
public interface HelloWorldInterface extends BaseContractInterface {
    /**
     * 合约接口定义
     *
     * @return 合约返回结果
     */
    String sayHello();
}
