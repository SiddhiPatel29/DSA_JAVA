import java.util.Arrays;
import java.util.Scanner;

public class FirstandLastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target element: ");
        int target = sc.nextInt();

        int[] result = firstLastOccurrence(n, arr, target);
        System.out.print(Arrays.toString(result));
    }
    public static int firstOccurrence(int n, int arr[], int target){
        int low = 0, high = n-1;
        int firstIndex = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                firstIndex = mid;
                high = mid - 1;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return firstIndex;
    }
    public static int lastOccurrence(int n, int arr[], int target){
        int low = 0, high = n-1;
        int lastIndex = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                lastIndex = mid;
                low = mid + 1;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return lastIndex;
    }
    public static int[] firstLastOccurrence(int n, int arr[], int target){
        int first = firstOccurrence(n, arr, target);
        if(first == -1){
            return new int[] {-1, -1};
        }
        int last = lastOccurrence(n, arr, target); 
        return new int[] {first, last};
    }
}
