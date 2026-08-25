import java.util.Scanner;

public class MinimizeMaximumDistanceBetweenGasStations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the additional gas stations: ");
        int additionalStations = sc.nextInt();

        double result = minMaxDistance(arr, additionalStations);
        System.out.print(result);
    }
    public static int countStations(int arr[], double gap){
        int cnt = 0;
        for (int i = 1; i < arr.length; i++) {
            double dist = arr[i] - arr[i-1];
            int numberBetween = (int) (dist / gap);
            if(numberBetween == numberBetween * gap){
                numberBetween--;
            }
            cnt += numberBetween;
        }
        return cnt;
    }
    public static double minMaxDistance(int arr[], int additionalStations){
        double maxGap = -1;
        for (int i = 0; i < arr.length-1; i++) {
            maxGap = Math.max(maxGap, arr[i+1] - arr[i]);
        }
        double low = 0, high = maxGap;
        while(high - low > 1e-6){
            double mid = low + (high - low) / 2;
            int cntStations = countStations(arr, mid);
            if(cntStations > additionalStations){
                low = mid;
            }else{
                high = mid;
            }
        }
        return high;
    }
}
