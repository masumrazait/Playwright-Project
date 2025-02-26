package feb24;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        String reversed="";
        int len=str.length();
        for(int i=len-1;i>=0;i--){
            reversed=reversed+str.charAt(i);
        }
        System.out.println(reversed);
    }
}
