import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarray_PrefixSumHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        int result = LongestSubarray(n, arr, k);
        System.out.println(result);
    }
    public static int LongestSubarray(int n, int arr[], int k){
        long sum = 0;
        int maxLen = 0;
        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum == k){
                maxLen = Math.max(maxLen, i+1);
            }

            long rem = sum - k;
            if(map.containsKey(rem)){
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return maxLen;
    }
}
