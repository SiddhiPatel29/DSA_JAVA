import java.util.Scanner;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");  
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = maxProductSubarray(arr);
        System.out.print("Maximum product subarray: " + result);
    }
    public static int maxProductSubarray(int arr[]){
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        int prefix = 1, suffix = 1;
        for(int i = 0; i < n; i++){
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;

            prefix*= arr[i];
            suffix *= arr[n-i-1];
            ans = Math.max(ans, Math.max(prefix, suffix));
        }   
        return ans;
    }
}
