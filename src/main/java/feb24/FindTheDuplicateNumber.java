package feb24;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        String str = "masumraza";
        Set<Character> uniqletter = new HashSet<>();
        Set<Character> dupletter = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (!uniqletter.add(ch)) {
                dupletter.add(ch);
            }
        }
        Set<Integer> uniq = new HashSet<>();
        Set<Integer> dup = new HashSet<>();

        for (int num : nums) {
            if (!uniq.add(num)) {
                dup.add(num);
            }
        }
        System.out.println(uniqletter);
        System.out.println(uniq);
    }
}
