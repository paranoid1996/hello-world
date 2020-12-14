import cn.hyperchain.contract.BaseContractInterface;

/**
 * @author blocface
 */
public interface FrameworkAdmin extends BaseContractInterface {
    /**
     * 注册新用户或者修改已有的角色。仅限管理员操作，且无法修改合约拥有者的角色
     *
     * @param userAddr 待注册或待修改的用户账号地址
     * @param role     待注册为或待修改为的用户角色
     * @return 是否操作成功
     */
    Boolean chmod(String userAddr, Role role);

    /**
     * 实现保存数据的接口，并且限制只有管理员才能操作
     *
     * @param myData 自定义数据，以JSON字符串形式输入
     * @return 返回是否插入成功
     */
    Boolean save(MyData myData);

    /**
     * 实现按主键查询数据的接口，并且限制只有管理员和客户才能操作
     *
     * @param id 待查询的数据主键
     * @return 自定义数据
     */
    MyData query(Integer id);
}
