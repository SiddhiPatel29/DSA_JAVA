import java.util.HashMap;
import java.util.Scanner;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        System.out.print("Enter the target string: ");
        String t = sc.nextLine();

        String result = minWindow(s, t);
        System.out.println("Minimum window substring: " + result);
    }
    public static String minWindow(String s, String t){
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0, count = 0, minLength = Integer.MAX_VALUE, start = -1;
        int n = s.length();
        int m = t.length();
        for(int i = 0; i < m; i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }
        while(right < n){
            if(map.getOrDefault(s.charAt(right), 0) > 0) count++;
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) - 1);

            while(count == m){
                if(right - left + 1 < minLength){
                    minLength = right - left + 1;
                    start = left;
                }

                map.put(s.charAt(left), map.getOrDefault(s.charAt(left), 0) + 1);
                if(map.get(s.charAt(left)) > 0) count--;
                left++;
            }
            right++;
        }
        return start == -1 ? "" : s.substring(start, start + minLength);
    }
}
