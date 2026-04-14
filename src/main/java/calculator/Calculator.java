package calculator;

public class Calculator {
    static void main() {

        //if you want to run this without an instance, and use the class methods, class methods must be static
        //i.e. static methods can be run without instances of the class

        Calculator calc1 = new Calculator();

        System.out.println(calc1.divide(10, 5));
        //System.out.println(divide(10, 0));
        try {
            System.out.println(calc1.divide(10, 0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //if you don't know what error to throw initially, try catch in the main to catch everything and explore error
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
