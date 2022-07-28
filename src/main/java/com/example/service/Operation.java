package com.example.service;

import com.example.entity.OperationEnum;

public class Operation {
    private int num1, num2;
    OperationEnum operationEnum;

    public Operation(int num1, int num2, OperationEnum operationEnum) {
        this.num1 = num1;
        this.num2 = num2;
        this.operationEnum = operationEnum;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public OperationEnum getOperationEnum() {
        return operationEnum;
    }

    public void setOperationEnum(OperationEnum operationEnum) {
        this.operationEnum = operationEnum;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", operationEnum=" + operationEnum +
                '}';

    }
    public double calculate() {
        double n = 0;
        switch (getOperationEnum()) {
            case SUM -> {
                n = getNum1() + getNum2();
                break;
            }
            case SUB -> {
                n = getNum1() - getNum2();
                break;
            }
            case DIV -> {
                n = getNum1() / getNum2();
                break;
            }
            case MULT -> {
                n = getNum1() * getNum2();
                break;
            }
        }
        return n;
    }

}
