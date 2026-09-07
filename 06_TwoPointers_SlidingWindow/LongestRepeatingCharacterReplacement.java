import java.util.HashMap;
import java.util.Scanner;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        System.out.print("Enter the maximum number of replacements allowed: ");
        int k = sc.nextInt();

        int result = characterReplacement(s, k);
        System.out.println("Length of the longest substring after replacements: " + result);
    }
    public static int characterReplacement(String s, int k){
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0, maxFreq = 0, maxLen = 0;
        while(right < s.length()){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(right)));
            if((right-left+1) - maxFreq > k){
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
            if((right-left+1) - maxFreq <= k){
                maxLen = Math.max(maxLen, right-left+1);
            }
            right++;
        }
        return maxLen;
    }
}
