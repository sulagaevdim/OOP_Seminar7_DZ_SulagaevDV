package controller;

import model.ComplexNumber;
import model.operation.*;
import view.View;

public class Controller {
    private final ComplexNumber complexNumber;

    public Controller(ComplexNumber complexNumber) {
        this.complexNumber = complexNumber;
    }
    public String sum(ComplexNumber one, ComplexNumber two) {
        return Sum.calculate(one, two);
    }
    public String subtraction(ComplexNumber one, ComplexNumber two) {
        return Subtraction.calculate(one, two);
    }
    public String multiplication(ComplexNumber one, ComplexNumber two) {
        return Multiplication.calculate(one, two);
    }
    public String devision(ComplexNumber one, ComplexNumber two) {
        return Devision.calculate(one, two);
    }

    public ComplexNumber createComplexNumber(int a, int b) {
        return complexNumber.createComplexNumber(a, b);
    }
}
