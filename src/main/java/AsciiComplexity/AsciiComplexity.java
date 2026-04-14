package AsciiComplexity;

import java.util.*;


public class AsciiComplexity {

    static void main(String[] args) {

        AsciiComplexity ascii = new AsciiComplexity();

        List<String> books = Arrays.asList("1984","Moby Dick", "To Kill a Mockingbird", "The Hunger Games", "IT", "The Catcher in the Rye");
        Map<Integer, String> bookAndValue = new TreeMap<>();

        for (String book : books) {
            bookAndValue.put(ascii.complexityOfString(book), book);
        }

        System.out.println(bookAndValue.values());
    }

    private int complexityOfString(String bookTitle) {
        char[] letterOFBookTitles = bookTitle.toCharArray();
        int asciiComplexity = 0;
        for (char character : letterOFBookTitles) {
            asciiComplexity += (int) character;
        } return asciiComplexity;
    }

}
