import java.util.Scanner;

public class PaintersPartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the no. of painters: ");
        int painters = sc.nextInt();

        int result = paintersPartition(arr, painters);
        System.out.print(result);
    }
    public static int calcPainters(int arr[], int boards){
        int painters = 1;
        long boardPainters = 0;
        for (int i = 0; i < arr.length; i++) {
            if(boardPainters + arr[i] <= boards){
                boardPainters += arr[i];
            }else{
                painters++;
                boardPainters = arr[i];
            }
        }
        return painters;
    }
    public static int paintersPartition(int arr[], int painters){
        int sum = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            max = Math.max(max, arr[i]);
        }
        int low = max, high = sum;
        while(low <= high){
            int mid = low + (high - low)/2;
            int totalpainters = calcPainters(arr, mid);
            if(totalpainters > painters){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
    }
}
