package model.operation;

import model.ComplexNumber;

public abstract interface Operable {
    public String calculate(ComplexNumber one, ComplexNumber two);
}
