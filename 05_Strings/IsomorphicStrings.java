import java.util.Scanner;

public class IsomorphicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        boolean result = isomorphicString(s, t);
        System.out.println(result);
    }
    public static boolean isomorphicString(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for(int i = 0; i < s.length(); i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(map1[ch1] != map2[ch2]){
                return false;
            }
            map1[ch1] = i + 1;
            map2[ch2] = i + 1;
        }
        return true;
    }
}
