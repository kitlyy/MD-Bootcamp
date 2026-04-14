package BouncingBall;

public class Main {
    static void main(String[] args) {
        System.out.println(numPasses(5, 1.5));
    }

    public static double numPasses(double ballHeight, double brotherHeight) {
        int passes = 0;
        while (ballHeight > brotherHeight) {
            ballHeight = ballHeight*(2.0/3);
            if (ballHeight > brotherHeight) {
                passes+=2;
            } else {
                return passes+=1;
            }
        }
        return passes;
    }
}
