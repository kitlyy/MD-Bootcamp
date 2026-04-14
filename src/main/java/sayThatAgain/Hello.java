package sayThatAgain;


public class Hello {
    static void main(String[] args) {
        String text = "test";
        int times = 3;

        try {
            System.out.println(text.repeat(times));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
