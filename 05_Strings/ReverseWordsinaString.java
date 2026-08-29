import java.util.Scanner;

public class ReverseWordsinaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String result = reverseWords(s);
        System.out.println(result);
    }
    public static String reverseWords(String s){
        String[] words = s.trim().split("\\s+");

        StringBuilder result = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--){
            result.append(words[i]);
            if(i != 0){
                result.append(" ");
            }
        }
        
        return result.toString();
    }
}
