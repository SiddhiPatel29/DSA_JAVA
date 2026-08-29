import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String[] str = sc.nextLine().split("\\s+");

        String result = longestCommonPrefix(str);
        System.out.println(result);
    }
    public static String longestCommonPrefix(String[] str){
        
        for(int i = 0; i < str[0].length(); i++){
            char ch = str[0].charAt(i);
            for(int j = 1; j < str.length; j++){
                if(i >= str[j].length() || str[j].charAt(i) != ch){
                    return str[0].substring(0, i);
                }
            }
        }
        return str[0];
    }
}
