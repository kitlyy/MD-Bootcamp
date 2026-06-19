package calculator;

public class Calculator {
    static void main() {


        Calculator calc1 = new Calculator();

        System.out.println(calc1.divide(10, 5));
        try {
            System.out.println(calc1.divide(10, 0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a/b;
    }

    public int add(int a, int b) {
        return a + b;
    }
}
