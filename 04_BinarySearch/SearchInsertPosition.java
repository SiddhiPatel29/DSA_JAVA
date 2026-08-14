import java.util.Scanner;

public class SearchInsertPosition {
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

        int result = searchInsertPosition(n, arr, target);
        System.out.print(result);
    }
    public static int searchInsertPosition(int n, int arr[], int target){
        int low = 0;
        int high = n-1;
        int index = arr.length;
        while(low <= high){
            int mid = low +(high - low)/2;
            if(arr[mid] >= target){
                index = mid;
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return index;
    }
}
