import java.util.Scanner;

public class LongestSubarraywithSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = LongestSubarray(n, arr);
        System.out.println(result);
    }  
    public static int LongestSubarray(int n, int arr[]){
        int sum = arr[0];
        int j = 0;
        int i = 0;
        int maxLen = 0;
        int k = 3;

        while (j < n) {
            while(i <= j && sum > k){
                    sum = sum - arr[i];
                    i++;
            }
            if(sum == k){
                maxLen = Math.max(maxLen, j-i+1);
            }
            
            j++;
            if(j < n){
                sum += arr[j];
            }
        }
        return maxLen;
    }
}
