import java.util.ArrayList;
import java.util.Scanner;

public class UnionofTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of first array: ");
        int n1 = sc.nextInt();
        
        int arr1[] = new int[n1];
        System.out.print("Enter the elements of first array: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of second array: ");
        int n2 = sc.nextInt();

        System.out.print("Enter the elements of second array: ");
        int arr2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        ArrayList<Integer> result = Union(n1, arr1, n2, arr2);
        System.out.println(result);
    }

    public static ArrayList<Integer> Union(int n1, int arr1[], int n2, int arr2[]) {
        ArrayList<Integer> unionArr = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                if (unionArr.size() == 0 || unionArr.getLast() != arr1[i]) {
                    unionArr.add(arr1[i]);
                }
                i++;
            } else if(arr1[i] > arr2[j]){
                if (unionArr.size() == 0 || unionArr.getLast() != arr2[j]) {
                    unionArr.add(arr2[j]);
                }
                j++;
            }
            else{
                if (unionArr.size() == 0 || unionArr.getLast() != arr1[i]) {
                    unionArr.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        while (i < n1) {
            if (unionArr.size() == 0 || unionArr.getLast() != arr1[i]) {
                unionArr.add(arr1[i]);
            }
            i++;
        }
        while (j < n2) {
            if (unionArr.size() == 0 || unionArr.getLast() != arr2[j]) {
                unionArr.add(arr2[j]);
            }
            j++;
        }

        return unionArr;
    }
}
