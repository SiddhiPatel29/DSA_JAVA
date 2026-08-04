import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j;
        for(j = 1; j < arr.length; j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        
        System.out.println("index: " + (i+1));
        for(int h = 0; h < i+1; h++){
            System.out.print(arr[h] + " ");
        }

    }
}
