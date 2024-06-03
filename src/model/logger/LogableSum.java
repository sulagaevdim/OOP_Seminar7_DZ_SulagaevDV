package model.logger;

import model.ComplexNumber;
import model.operation.Operable;
import model.operation.Operation;
import model.operation.Sum;

public class LogableSum extends Operation implements Operable, Delayable {

    public LogableSum(ComplexNumber one, ComplexNumber two) {
        super(one, two);
    }

    @Override
    public String calculate(ComplexNumber one, ComplexNumber two) {
        System.out.print("Операция сложения выполняется, подождите..");
        Delayable.delay();
        Sum sum = new Sum(one, two);
        return sum.calculate(one, two);
    }
}
