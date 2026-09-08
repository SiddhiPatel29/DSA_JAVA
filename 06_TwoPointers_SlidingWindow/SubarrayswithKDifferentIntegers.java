import java.util.HashMap;
import java.util.Scanner;

public class SubarrayswithKDifferentIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target number of different integers: ");
        int target = sc.nextInt();

        int result = numSubarraysWithKDifferentIntegers(arr, target) - numSubarraysWithKDifferentIntegers(arr, target - 1);
        System.out.println(result);
    }
    public static int numSubarraysWithKDifferentIntegers(int arr[], int target){
        int left = 0, right = 0, count = 0;
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(right < n){
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            while(map.size() > target){
                map.put(arr[left], map.get(arr[left]) - 1);
                if(map.get(arr[left]) == 0) map.remove(arr[left]);
                left++;
            }
            count += right - left + 1;
            right++;
        }
        return count;
    }
}
