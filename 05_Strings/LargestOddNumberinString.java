import java.util.Scanner;

public class LargestOddNumberinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String result = largestOddNumber(s);
        System.out.println(result);
    }
    public static String largestOddNumber(String s){
        for(int i = s.length() - 1; i >= 0; i--){
            int digit = s.charAt(i) - '0';
            if(digit % 2 == 1){
                return s.substring(0, i + 1);
            }
        }
        return "";
    }
}
