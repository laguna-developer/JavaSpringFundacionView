package org.fundacionview.classone.calculator.console.main;

public class Calculator {
    public static void main(String[] args) {
        Operation operation = new Operation();
        System.out.println(operation.sum(1,2));
        System.out.println(operation.resta(2,1));
        System.out.println(operation.multiplicacion(2,3));
        System.out.println(operation.division(10,5));
    }
}
