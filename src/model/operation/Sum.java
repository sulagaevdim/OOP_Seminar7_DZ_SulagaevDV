package model.operation;


import model.ComplexNumber;

public class Sum extends Operation implements Operable {

    public Sum(ComplexNumber one, ComplexNumber two) {
        super(one, two);
    }

    @Override
    public String calculate(ComplexNumber one, ComplexNumber two) {
        ComplexNumber sum = new ComplexNumber(one.getA() + two.getA(),one.getB() + two.getB());
        return sum.toString();
    }
}
