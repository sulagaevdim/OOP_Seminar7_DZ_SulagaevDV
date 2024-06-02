package model;

public class ComplexNumber {
    private int a;
    private int b;

    public ComplexNumber(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        if ((b < 0) & (a != 0)) return a + " - " + Math.abs(b) + 'i';
        else if (b == 0) return String. format("%d", a);
        else if (a == 0) return b + "i";
        else return a + " + " + b + 'i';
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public ComplexNumber createComplexNumber(int a, int b) {
        return new ComplexNumber(a, b);
    }
}
