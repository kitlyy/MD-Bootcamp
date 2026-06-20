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
            //extraction
            // can make the argument that it's not better since there are more lines of code!
            boolean fizz = i % 3 == 0;
            boolean buzz = i % 5 == 0;
            boolean fizzBuzz = i % 3 == 0 && i % 5 == 0;

            if (fizzBuzz) { result += "FizzBuzz "; }
            else if (fizz) {
                result += "Fizz ";
            } else if (buzz) {
                result += "Buzz ";
            } else {
                result += i + " ";
            }
        }
        return result;
    }
}
