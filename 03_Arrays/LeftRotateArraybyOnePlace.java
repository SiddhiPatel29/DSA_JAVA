import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateArraybyOnePlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        if (n <= 1) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
