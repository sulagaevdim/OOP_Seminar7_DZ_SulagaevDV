package model.operation;

import model.ComplexNumber;

public class Subtraction extends Operation implements Operable{

    public Subtraction(ComplexNumber one, ComplexNumber two) {
        super(one, two);
    }

    @Override
    public String calculate(ComplexNumber one, ComplexNumber two) {
        ComplexNumber sub = new ComplexNumber(one.getA() - two.getA(),one.getB() - two.getB());
        return sub.toString();
    }
}
