package model.operation;

import model.ComplexNumber;

public class Operation {
    protected ComplexNumber one;
    protected ComplexNumber two;

    public Operation(ComplexNumber one, ComplexNumber two) {
        this.one = one;
        this.two = one;
    }
//    public static String calculate(ComplexNumber one, ComplexNumber two) {
//        return null;
//    }
}
