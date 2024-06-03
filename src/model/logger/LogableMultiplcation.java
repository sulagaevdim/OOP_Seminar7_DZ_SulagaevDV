package model.logger;

import model.ComplexNumber;
import model.operation.Devision;
import model.operation.Multiplication;
import model.operation.Operable;
import model.operation.Operation;

public class LogableMultiplcation extends Operation implements Operable, Delayable {
    public LogableMultiplcation(ComplexNumber one, ComplexNumber two) {
        super(one, two);
    }

    @Override
    public String calculate(ComplexNumber one, ComplexNumber two) {
        System.out.print("Операция умножения выполняется, подождите..");
        Delayable.delay();
        Multiplication multiplication = new Multiplication(one, two);
        return multiplication.calculate(one, two);
    }
}
