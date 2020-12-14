import cn.hyperchain.contract.BaseContractInterface;

/**
 * @author blocface
 */
public interface FrameworkClient extends BaseContractInterface {
    /**
     * 实现按主键查询数据的接口，并且限制只有管理员和客户才能操作
     *
     * @param id 待查询的数据主键
     * @return 自定义数据
     */
    MyData query(Integer id);
}
