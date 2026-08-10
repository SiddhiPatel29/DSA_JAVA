import java.util.Scanner;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxCount = maximumConsecutiveOnes(arr);
        System.out.println(maxCount);
    }
    public static int maximumConsecutiveOnes(int arr[]){
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                count += 1;
                maxCount = Math.max(maxCount, count);
            }
            else{
                count = 0;
            }
        }
        return maxCount;
    }
}
