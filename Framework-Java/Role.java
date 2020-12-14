/**
 * 用户角色，用于权限校验
 * 注意，Role.ANY=0，用于占住零值
 *
 * @author blocface
 */
public enum Role {
    /**
     * 任何人
     */
    ANY,
    /**
     * 管理员
     */
    ADMIN,
    /**
     * 客户
     */
    CLIENT,
}
