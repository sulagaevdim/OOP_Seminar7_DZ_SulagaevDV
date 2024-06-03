package model.logger;

import model.ComplexNumber;
import model.operation.Multiplication;
import model.operation.Operable;
import model.operation.Operation;
import model.operation.Subtraction;

public class LogableSubstraction extends Operation implements Operable, Delayable{
    public LogableSubstraction(ComplexNumber one, ComplexNumber two) {
        super(one, two);
    }

    @Override
    public String calculate(ComplexNumber one, ComplexNumber two) {
        System.out.print("Операция вычитания выполняется, подождите..");
        Delayable.delay();
        Subtraction subtraction = new Subtraction(one, two);
        return subtraction.calculate(one, two);
    }
}
