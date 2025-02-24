package feb24;

public class EvenLetterPrintFromString {
    public static void main(String[] args) {
        String str = "masumraza";
        //for even index
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();
        //for odd index
        for (int j = 0; j < str.length(); j++) {
            if (j % 2 != 0) {
                System.out.print(str.charAt(j));
            }
        }
    }
}
