import java.util.Arrays;
import java.util.Scanner;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of intervals: ");
        int n = sc.nextInt();

        int arr[][] = new int[n][2];
        System.out.println("Enter the intervals (start and end): ");
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int result[][] = mergeIntervals(arr);
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i][0] + " " + result[i][1]);
        }
    }
    public static int[][] mergeIntervals(int arr[][]){
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int n = arr.length;
        int index = 0;
        int result[][] = new int[n][2];
        for(int i = 0; i < n; i++){
            if(index == 0 || result[index - 1][1] < arr[i][0]){
                result[index][0] = arr[i][0];
                result[index][1] = arr[i][1];
                index++;
            }
            else{
                result[index - 1][0] = Math.min(result[index - 1][0], arr[i][0]);
                result[index - 1][1] = Math.max(result[index - 1][1], arr[i][1]);
            }
        }
        return result;
    }
}
