import java.util.Scanner;

public class KokoEatingBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the required time: ");
        int requiredHours = sc.nextInt();

        int result = calculateSpeed(arr, requiredHours);
        System.out.print(result);
    }
    public static int findMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
    public static int calculateHours(int arr[], int hourly){
        int totalHours = 0;
        for (int i = 0; i < arr.length; i++) {
            totalHours += Math.ceil((double)arr[i] / (double)hourly);
        }
        return totalHours;
    }
    public static int calculateSpeed(int arr[], int requiredHours){
        int low = 0, high = findMax(arr);
        while(low <= high){
            int mid = (low + high) / 2;
            int totalHours = calculateHours(arr, mid);
            if(totalHours <= requiredHours){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}
