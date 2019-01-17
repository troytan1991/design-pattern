package com.troytan.creation.simplefactory;


/**
 * TODO description
 * @author s8xriw
 * @date 2017年12月4日
 */

public class OperationFactory {

    public static Operation createOperation(String operationStr) {
        Operation operation = null;
        
        switch (operationStr) {
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new SubOperation();
                break;
            case "*":
                operation = new MulOperation();
                break;
            case "/":
                operation = new DivOperation();
                break;
            default:
                break;
        }
        
        return operation;
    }
}
