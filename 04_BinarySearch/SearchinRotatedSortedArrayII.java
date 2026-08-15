import java.util.Scanner;

public class SearchinRotatedSortedArrayII{
        
    public static void main(String[] args){
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

        boolean result = search(n, arr, target);
        System.out.println(result);
    }
    public static boolean search(int n, int arr[], int target){
        int low = 0, high = n-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                return true;
            }
            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                low++;
                high--;
                continue;
            }
            if(arr[low] <= arr[mid]){
                if(arr[low] <= target && target <=arr[mid]){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }
            else{
                if (arr[mid] <= target && target <= arr[high]) {
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}