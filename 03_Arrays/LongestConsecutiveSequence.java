import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int length = longestConsecutive(arr);
        System.out.println(length);
    }
    public static int longestConsecutive(int arr[]){
        if(arr.length == 0) return 0;
        int maxLen = 1;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }

        for(int i = 0; i < arr.length; i++){
            if(!set.contains(arr[i] - 1)){
                int currentNum = arr[i];
                int currentLen = 1;

                while(set.contains(currentNum + 1)){
                    currentNum++;
                    currentLen++;
                }
                maxLen = Math.max(maxLen, currentLen);
            }
        }
        return maxLen;
    }
}
