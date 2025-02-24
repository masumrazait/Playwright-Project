package feb24;

public class ExtractSpecialCharacterFromString {
    public static void main(String[] args) {
        String str = "masu34546@%%$#m@raza";
        String specialChar = str.replaceAll("[^a-z]","");
        System.out.println(specialChar);
    }
}
