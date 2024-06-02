import controller.Controller;
import model.ComplexNumber;
import view.View;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        View view = new View(new Controller(new ComplexNumber(0,0)));
        view.run();
    }
}