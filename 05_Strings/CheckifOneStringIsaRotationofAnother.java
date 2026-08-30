import java.util.Scanner;

public class CheckifOneStringIsaRotationofAnother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        boolean result = checkRotation(s, t);
        System.out.println(result);
    }
    public static boolean checkRotation(String s, String t){
        if(s.length() != t.length()) return false;

        return (s + s).contains(t);
    }
}
