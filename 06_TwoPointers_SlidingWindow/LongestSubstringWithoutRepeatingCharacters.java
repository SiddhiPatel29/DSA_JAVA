import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        int length = lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }
    public static int lengthOfLongestSubstring(String s){
        int n = s.length();
        int left = 0, right = 0, maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(right < n){
            if(map.containsKey(s.charAt(right))){
                if(map.get(s.charAt(right)) >= left) {
                    left = map.get(s.charAt(right)) + 1;
                }
            }
            map.put(s.charAt(right), right);
            int length = right - left + 1;
            maxLength = Math.max(maxLength, length);
            right++;
        }
        return maxLength;
    } 
}