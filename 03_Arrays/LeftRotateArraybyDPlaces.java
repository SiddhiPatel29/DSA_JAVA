import java.util.Scanner;

public class LeftRotateArraybyDPlaces {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        d = d % n;
        int temp[] = new int[d];
        for(int i = 0; i < d; i++){
            temp[i] = arr[i];
        }

        for(int i = d; i < n; i++){
            arr[i-d] = arr[i];
        }

        for(int i = 0; i < d; i++){
            arr[n-d+i] = temp[i];        
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
