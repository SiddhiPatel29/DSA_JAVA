import java.util.Scanner;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = maxProfit(arr);
        System.out.println(result);
    }
    public static int maxProfit(int arr[]){
        int maxProf = 0;
        int minPrice = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int cost = arr[i] - minPrice;
            maxProf = Math.max(maxProf, cost);
            minPrice = Math.min(minPrice, arr[i]);
        }
        return maxProf;
    }
}
