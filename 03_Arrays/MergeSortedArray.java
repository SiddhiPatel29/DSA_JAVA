import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of first array: ");
        int m = sc.nextInt();
        
        System.out.print("Enter the size of second array: ");
        int n = sc.nextInt();
        
        int arr1[] = new int[m + n];
        System.out.print("Enter the elements of first array: ");
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the elements of second array: ");
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        mergeArrays(m, arr1, n, arr2);
        System.out.print("Merged array: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
    public static void mergeArrays(int m, int arr1[], int n, int arr2[]){
        int i = m - 1, j = n - 1, k = m + n - 1;
        while(i >= 0 && j >= 0){
            if(arr1[i] > arr2[j]){
                arr1[k--] = arr1[i--];
            }
            else{
                arr1[k--] = arr2[j--];
            }
        }
        while(j >= 0){
            arr1[k--] = arr2[j--];
        }
    }
}
