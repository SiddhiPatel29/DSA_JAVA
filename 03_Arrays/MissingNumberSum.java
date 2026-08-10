import java.util.Scanner;

public class MissingNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n-1];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n-1; i++) {
            arr[i] = sc.nextInt();
        }

        int missingElement = MissingNumber(n, arr);
        System.out.println(missingElement);
    }
    public static int MissingNumber(int n, int arr[]){
        int sumOfNElements = 0;
        for (int i = 1; i <= n; i++) {
            sumOfNElements = sumOfNElements + i;
        }

        int sumOfArrayElements = 0;
        for(int i = 0; i < arr.length; i++){
            sumOfArrayElements = sumOfArrayElements + arr[i];
        }

        return (sumOfNElements - sumOfArrayElements);

        
    }
}
