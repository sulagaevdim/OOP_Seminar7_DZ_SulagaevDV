package controller;

import model.ComplexNumber;
import model.logger.LogableDevision;
import model.logger.LogableMultiplcation;
import model.logger.LogableSubstraction;
import model.logger.LogableSum;
import model.operation.*;
import view.View;

public class Controller {
    private final ComplexNumber complexNumber;

    public Controller(ComplexNumber complexNumber) {
        this.complexNumber = complexNumber;
    }
    public String sum(ComplexNumber one, ComplexNumber two) {
        LogableSum logableSum = new LogableSum(one, two);
        return logableSum.calculate(one, two);
    }
    public String subtraction(ComplexNumber one, ComplexNumber two) {
        LogableSubstraction subtraction = new LogableSubstraction(one, two);
        return subtraction.calculate(one, two);
    }
    public String multiplication(ComplexNumber one, ComplexNumber two) {
        LogableMultiplcation multiplication = new LogableMultiplcation(one, two);
        return multiplication.calculate(one, two);
    }
    public String devision(ComplexNumber one, ComplexNumber two) {
        LogableDevision devision = new LogableDevision(one, two);
        return devision.calculate(one, two);
    }

    public ComplexNumber createComplexNumber(int a, int b) {
        return complexNumber.createComplexNumber(a, b);
    }
}
