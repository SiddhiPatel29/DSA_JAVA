import java.util.Scanner;

public class MinimumDaystoMakeMBouquets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the no. of bouquets required: ");
        int m = sc.nextInt();

        System.out.print("enter the adjacent flowers to form a bouquet: ");
        int k = sc.nextInt();

        int result = minimumDays(arr, m, k);
        System.out.print(result);
    }
    public static boolean possible(int arr[], int day, int m, int k){
        int count = 0;
        int totalBouquets = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= day){
                count++;
            }else{
                totalBouquets += (count/k);
                count = 0;
            }
        }
        totalBouquets += (count/k);
        return totalBouquets >= m;
    }
    public static int minimumDays(int arr[], int m, int k){
        if((long)m * k > arr.length) return -1;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        int low = min, high = max;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(possible(arr, mid, m, k)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}
