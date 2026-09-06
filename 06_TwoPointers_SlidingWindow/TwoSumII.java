import java.util.Scanner;

public class TwoSumII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        int result[] = twoSum(arr, target);
        System.out.println("{" + result[0] + ", " + result[1] + "}");
    }
    public static int[] twoSum(int arr[], int target){
        int n = arr.length;
        int left = 0, right = n-1;
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                return new int[]{left+1, right+1};
            }
            else if(sum < target) left++;
            else right--;
        }
        return new int[]{-1, -1}; 
    }
}
