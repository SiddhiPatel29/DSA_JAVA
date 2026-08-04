import java.util.Scanner;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isSorted = true;
        for(int i = 1; i<n; i++){
            if(arr[i] < arr[i-1]){
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);
    }
}
