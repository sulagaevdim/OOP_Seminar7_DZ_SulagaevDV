package model.operation;

import model.ComplexNumber;

public class Multiplication extends Operation implements Operable{
    public Multiplication(ComplexNumber one, ComplexNumber two) {
        super(one, two);
    }
    public static String calculate(ComplexNumber one, ComplexNumber two) {
        ComplexNumber mult = new ComplexNumber(((one.getA() * two.getA()) - (one.getB() * two.getB())),
                ((one.getA()) * two.getB()) + (two.getA() * one.getB()));
        return mult.toString();
    }
}

