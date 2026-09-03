import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<List<Integer>> triplets = findThreeSum(arr);
        System.out.println("Triplets that sum to zero:");
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }
    public static ArrayList<List<Integer>> findThreeSum(int arr[]){
        Arrays.sort(arr);
        ArrayList<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(i > 0 && arr[i] == arr[i-1]) continue;
            int j = i + 1;
            int k = arr.length - 1;
            
            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == 0){
                    List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
                    result.add(triplet);
                    j++;
                    k--;
                    while(j < k && arr[j] == arr[j-1]) j++;
                    while(j < k && arr[k] == arr[k+1]) k--;

                }else if(sum < 0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return result;
    }
}
