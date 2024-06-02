package model.operation;

import model.ComplexNumber;

public class Devision extends Operation implements Operable{
    public Devision(ComplexNumber one, ComplexNumber two) {
        super(one, two);
    }
    public static String calculate(ComplexNumber one, ComplexNumber two) {
        ComplexNumber topPart = new ComplexNumber(((one.getA() * two.getA()) - (one.getB() * two.getB() * -1)),
                ((one.getA()) * two.getB() * -1) + (two.getA() * one.getB()));
        int bottomPart = ((two.getA() * two.getA()) + (two.getB() * two.getB()));
        ComplexNumber dev = new ComplexNumber((topPart.getA() / bottomPart), topPart.getB() / bottomPart);
        return dev.toString();
    }
}
