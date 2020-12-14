package main

import (
	"fmt"
	"github.com/hyperledger/fabric/core/chaincode/shim"
	pb "github.com/hyperledger/fabric/protos/peer"
)

const ADMIN = "admin"
const CLIENT = "client"

// Framework example simple Chaincode implementation
type Framework struct {
}

func (t *Framework) Init(stub shim.ChaincodeStubInterface) pb.Response {
	fmt.Println("Framework Init")
	creatorByte, err := stub.GetCreator()
	if err != nil {
		return shim.Error(err.Error())
	}

	err = stub.PutState(string(creatorByte), []byte(ADMIN))
	if err != nil {
		return shim.Error(err.Error())
	}

	return shim.Success(creatorByte)
}

func (t *Framework) Invoke(stub shim.ChaincodeStubInterface) pb.Response {
	fmt.Println("Framework Invoke")
	function, args := stub.GetFunctionAndParameters()
	if function == "chmod" {
		return t.chmod(stub, args)
	} else if function == "save" {
		return t.save(stub, args)
	} else if function == "query" {
		return t.query(stub, args)
	}
	return shim.Success(nil)
}

func (t *Framework) chmod(stub shim.ChaincodeStubInterface, args []string) pb.Response {
	return shim.Success(nil)
}

func (t *Framework) save(stub shim.ChaincodeStubInterface, args []string) pb.Response {
	return shim.Success(nil)
}

func (t *Framework) query(stub shim.ChaincodeStubInterface, args []string) pb.Response {
	return shim.Success(nil)
}

func main() {
	err := shim.Start(new(Framework))
	if err != nil {
		fmt.Printf("Error starting Framework chaincode: %s", err)
	}
}
