import java.util.Scanner;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = maximumSubarraySum(n, arr);
        System.out.print(result);
    }

    public static int maximumSubarraySum(int n, int arr[]) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        // int j = 0;
        for (int i = 0; i < arr.length; i++) {
            
            
                sum = Math.max(arr[i], sum + arr[i]);
                maxSum = Math.max(maxSum, sum);
            
            
        }
        return maxSum;
    }
}
