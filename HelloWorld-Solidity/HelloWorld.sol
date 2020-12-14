// 推荐使用Hyperchain目前支持的0.4.15版本的Solidity编译器
pragma solidity 0.4.15;

/// @title HelloWorld示例合约
/// @notice 便于零基础开发者快速熟悉合约及其管理流程
/// @author blocface
contract HelloWorld {

    /// @notice 实现返回HelloWorld字符串的公共函数
    /// @dev Solidity的string类型以utf8为编码格式
    /// @return string 返回HelloWorld
    function sayHello() public returns (string) {
        return "Hello World!";
    }
}
