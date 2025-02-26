package feb24;

import java.util.Set;

public class DuplicateWord {
    public static void main(String[] args) {
        String str = "Big black bug bit a big black dog on his big black nose";
        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    System.out.println("Duplicate word: " + words[i]);
                }
            }
        }
    }

}
