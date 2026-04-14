package welcome;

public class Greeting {
    String name;

    public Greeting(String name) {
        this.name = name;
    }
    static void main(String[] args) {

    }

    public String getGreeting() {
        String message = "Hello " + this.name;
        message += ". How are you today?";
        return message;
    }
}
