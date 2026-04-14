package golf;

public class Golf {

    static void main(String[] args) {

        String[] shotNames = { "Hole in one!", "Eagle", "Birdie", "Par", "Bogey", "Double Bogey", "Quit" };
        int par = 3;
        int strokes = 1;

        if (strokes == 1) {
            System.out.println("Hole in one");
        } else if (strokes <= par - 2) {
            System.out.println("Eagle");
        } else if (strokes == par - 1) {
            System.out.println("Birdie");
        } else if (strokes == par) {
            System.out.println("Par");
        } else if (strokes == par + 1) {
            System.out.println("Bogey");
        } else if (strokes == par + 2) {
            System.out.println("Double bogey");
        } else if (strokes >= par + 3) {
            System.out.println("Quit");
        }
    }

}
