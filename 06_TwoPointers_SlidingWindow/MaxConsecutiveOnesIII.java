import java.util.Scanner;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the maximum number of zeros you can flip: ");
        int k = sc.nextInt();

        int result = maxConsecutiveOnes(arr, k);
        System.out.println(result);
    }
    public static int maxConsecutiveOnes(int arr[], int k){
        int n = arr.length;
        int left = 0, right = 0, maxLength = 0, zeroes = 0;
        while(right < n){
            if(arr[right] == 0) zeroes++;
            if(zeroes > k){
                if(arr[left] == 0) zeroes--;
                left++;
            }
            if(zeroes <= k){
                int length = right - left + 1;
                maxLength = Math.max(maxLength, length);
            }
            right++;
        }
        return maxLength;
    }
}
