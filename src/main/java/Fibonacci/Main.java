package Fibonacci;

public class Main {
    static void main() {
        for (int i = 0; i < 6; i++) { System.out.println(fibonacci(i)); }
    }

    public static int fibonacci(int n) {
        return (n <= 1) ? n:fibonacci(n - 1) + fibonacci(n - 2);
    }
}
