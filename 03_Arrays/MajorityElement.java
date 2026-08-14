import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = majorityElement(n, arr);
        System.out.print(result);
    }
    public static int majorityElement(int n, int arr[]){
        int count = 0;
        int element = arr[0];
        for (int i = 0; i < n; i++) {
            if(count == 0){
                count = 1;
                element = arr[i];
            }else if(arr[i] == element){
                count += 1;
            }else{
                count -= 1;
            }
        }
        int frequency = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element){
                frequency += 1;
            }
        }
        if (frequency > n/2) {
            return element;
        }
        return -1;
    }
}
