import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArrayElementsbySign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = rearrangeArrayElements(n, arr);
        System.out.print(Arrays.toString(result));
    }
    public static int[] rearrangeArrayElements(int n, int arr[]){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                pos.add(arr[i]);
            }else{
                neg.add(arr[i]);
            }
        }
        if(pos.size() > neg.size()){
            for (int i = 0; i < neg.size(); i++) {
                arr[2*i] = pos.get(i);
                arr[2*i+1] = neg.get(i);
            }
            int index = 2 * neg.size();
            for (int i = neg.size(); i < pos.size(); i++) {
                arr[index] = pos.get(i);
                index++;
            }
        }else{
            for (int i = 0; i < pos.size(); i++) {
                arr[2*i] = pos.get(i);
                arr[2*i+1] = neg.get(i);
            }
            int index = 2 * pos.size();
            for (int i = pos.size(); i < neg.size(); i++) {
                arr[index] = neg.get(i);
                index++;
            } 
        }
        return arr;
    }
}
