package feb24;

public class WordCountInString {
    public static void main(String[] args) {
        String str = "This is a test string";
        String[] words = str.split(" ");
        System.out.println("Number of words in the string: " + words.length);
    }
}
