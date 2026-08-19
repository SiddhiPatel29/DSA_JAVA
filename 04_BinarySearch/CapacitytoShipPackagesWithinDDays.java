import java.util.Scanner;

public class CapacitytoShipPackagesWithinDDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the max days: ");
        int d = sc.nextInt();

        int result = minCapacity(arr, d);
        System.out.println(result);
    }
    public static int findDays(int arr[], int cap){
        int load = 0, days = 1;
        for (int i = 0; i < arr.length; i++) {
            if(load + arr[i] > cap){
                days++;
                load = arr[i];
            }
            else{
                load += arr[i];
            }
        }
        return days;
    }
    public static int minCapacity(int arr[], int d){
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            sum += arr[i];
        }
        int low = max, high = sum;
        while(low <= high){
            int mid = low + (high - low)/2;
            int totalDays = findDays(arr, mid);
            if(totalDays <= d){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}
