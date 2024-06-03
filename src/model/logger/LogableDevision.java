package model.logger;

import model.ComplexNumber;
import model.operation.Devision;
import model.operation.Operable;
import model.operation.Operation;
import model.operation.Sum;

public class LogableDevision extends Operation implements Operable, Delayable {
    public LogableDevision(ComplexNumber one, ComplexNumber two) {
        super(one, two);
    }

    @Override
    public String calculate(ComplexNumber one, ComplexNumber two) {
        System.out.print("Операция деления выполняется, подождите..");
        Delayable.delay();
        Devision devision = new Devision(one, two);
        return devision.calculate(one, two);
    }
}
