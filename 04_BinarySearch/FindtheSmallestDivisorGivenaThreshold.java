import java.util.Scanner;

public class FindtheSmallestDivisorGivenaThreshold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("enter the value of threshold: ");
        int t = sc.nextInt();

        int result = findDivisor(arr, t);
        System.out.println(result);
    }
    public static int calcThreshold(int arr[], int mid){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.ceil((double)arr[i] / (double)mid);
        }
        return sum;
    }
    public static int findDivisor(int arr[], int t){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int low = 1, high = max;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(calcThreshold(arr, mid) <= t){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}
