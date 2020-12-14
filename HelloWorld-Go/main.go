package main

import (
	"fmt"
	"github.com/hyperledger/fabric/core/chaincode/shim"
	pb "github.com/hyperledger/fabric/protos/peer"
)

// HelloWorld example simple Chaincode implementation
type HelloWorld struct {
}

func (t *HelloWorld) Init(stub shim.ChaincodeStubInterface) pb.Response {
	fmt.Println("HelloWorld Init")
	return shim.Success(nil)
}

func (t *HelloWorld) Invoke(stub shim.ChaincodeStubInterface) pb.Response {
	fmt.Println("HelloWorld Invoke")
	function, args := stub.GetFunctionAndParameters()
	if function == "sayHello" {
		// Make payment of X units from A to B
		return t.sayHello(stub, args)
	}

	return shim.Error("Invalid invoke function name. Expecting \"sayHello\"")
}

// Transaction return HelloWorld strings
func (t *HelloWorld) sayHello(stub shim.ChaincodeStubInterface, args []string) pb.Response {
	return shim.Success([]byte("HelloWorld"))
}

func main() {
	err := shim.Start(new(HelloWorld))
	if err != nil {
		fmt.Printf("Error starting Simple chaincode: %s", err)
	}
}
