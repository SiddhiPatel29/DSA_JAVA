import java.util.Scanner;

public class FindMinimuminRotatedSortedArrayII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findMinimum(arr);
        System.out.println(result);
    }
    public static int findMinimum(int arr[]){
        int low = 0, high = arr.length - 1;
        int min = Integer.MAX_VALUE;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[low] <= arr[high]){
                min = Math.min(min, arr[low]);
            }

            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                min = Math.min(min, arr[low]);
                low++;
                high--;
                continue;
            }

            if(arr[low] <= arr[mid]){
                min = Math.min(min, arr[low]);
                low = mid + 1;
            }
            else{
                min = Math.min(min, arr[mid]);
                high = mid - 1;
            }
        }

        return min;
    }
}
