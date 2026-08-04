import java.util.Scanner;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int j = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }

        for (int i = j + 1; i < arr.length; i++) {
            if(arr[i] != 0 && j != -1){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
