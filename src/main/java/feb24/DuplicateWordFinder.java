package feb24;

public class DuplicateWordFinder {
    public static void main(String[] args) {
        String str = "This is a test string is a is test Test";
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    System.out.println("Duplicate word: " + words[i]);
                }
            }
        }
    }
}
