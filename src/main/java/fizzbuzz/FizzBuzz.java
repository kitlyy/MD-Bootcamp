package fizzbuzz;

public class FizzBuzz {
    static void main() {
        FizzBuzz fb = new FizzBuzz();
        //System.out.println(fb.getFizzBuzz(1, 20));
        System.out.println(fb.getFizzBuzz(1, 20));
    }

    public String getFizzBuzz(int start, int end) {
        String result = "";
        for (int i = start; i < end + 1; i++ ) {
            if (i % 3 == 0 && i % 5 == 0) { result += "FizzBuzz "; }
            else if (i % 3 == 0) {
                result += "Fizz ";
            } else if (i % 5 == 0) {
                result += "Buzz ";
            } else {
                result += i + " ";
            }
        }
        return result;
    }
}
