package view;

import controller.Controller;
import model.ComplexNumber;

import java.util.Scanner;

public class View {
    private Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void run(){
        while (true) {
            ComplexNumber one = controller.createComplexNumber(numberRequest("a","первого"),
                                                                numberRequest("b","первого"));
            ComplexNumber two = controller.createComplexNumber(numberRequest("a","второго"),
                                                                numberRequest("b","второго"));
            String operator = operationRequest();
            switch (operator) {
                case "+":
                    System.out.println("Результатом сложения: "
                            + controller.sum(one, two));
                    break;
                case "-":
                    System.out.println("Результатом вычитания: "
                            + controller.subtraction(one, two));
                    break;
                case "*":
                    System.out.println("Результатом умножения: "
                            + controller.multiplication(one, two));
                    break;
                case "/":
                    System.out.println("Результатом деления: "
                            + controller.devision(one, two));
                    break;
            }
            String action = prompt();
            if (!action.equalsIgnoreCase("да")) {
                System.exit(0);
            }
        }
    }
    private String prompt() {
        Scanner in = new Scanner(System.in);
        System.err.print("Продолжить?... (да/нет): ");
        return in.nextLine();
    }
    private int numberRequest(String aOrB, String numberNumber){
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите дейсвительное число %s %s комплексного числа: ", aOrB, numberNumber);
        return in.nextInt();
    }
    private String operationRequest() {
        Scanner in = new Scanner(System.in);
        System.out.print("ВВедите математическую операцию (*, +, /, -) : ");
        String operator = in.nextLine();
        while (true) {
            if ((!(operator.equals("+"))) &
                    (!(operator.equals("-"))) &
                    (!(operator.equals("*"))) &
                    (!(operator.equals("/")))) {
                System.err.print("Введите математическую операцию корректно (*, +, /, -) : ");
                operator = in.nextLine();
            } else return operator;
        }
    }
}
