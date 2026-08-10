import java.util.Scanner;

public class MissingNumberXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n-1];
        System.out.print("Enter the elements of array: ");
        for(int i = 0; i < n-1; i++){
            arr[i] = sc.nextInt();
        }

        int missingElement = MissingNumber(n, arr);
        System.out.print(missingElement);
    }
    
    public static int MissingNumber(int n, int arr[]){
        int xor1 = 0;
        int xor2 = 0;

        for (int i = 1; i <= n; i++) {
            xor1 = xor1 ^ i;
        }

        for (int i = 0; i < arr.length; i++) {
            xor2 = xor2 ^ arr[i];
        }

        return (xor1 ^ xor2);
    }
}
