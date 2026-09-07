import java.util.Scanner;

public class BinarySubarraysWithSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        int result = numSubarraysWithSum(arr, target) - numSubarraysWithSum(arr, target - 1);
        System.out.println(result);
    }
    public static int numSubarraysWithSum(int arr[], int target){
        int n = arr.length;
        int left = 0, right = 0, sum = 0, count = 0;

        if(target < 0) return 0;

        while(right < n){
            sum += arr[right];
            while(sum > target){ 
                sum -= arr[left];
                left++;
            }
            if(sum <= target){
                count += (right - left + 1);
            }
            right++;
        }
        return count;
    }
}
