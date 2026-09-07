import java.util.HashMap;
import java.util.Scanner;

public class FruitIntoBaskets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] fruits = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            fruits[i] = sc.nextInt();
        }

        System.out.println("Enter the distinct fruit types: ");
        int k = sc.nextInt();
        
        int result = totalFruits(fruits, k);
        System.out.println("Maximum number of fruits that can be collected: " + result);
    }
    public static int totalFruits(int arr[], int k){
        int n = arr.length;
        int left = 0, right = 0, maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        while(right < n){
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            if(map.size() > k){
                map.put(arr[left], map.get(arr[left]) - 1);
                if(map.get(arr[left]) == 0) map.remove(arr[left]);
                left++;
            }
            if(map.size() <= k){
                maxLen = Math.max(maxLen, right-left+1);
            }
            right++;
        }
        return maxLen;
    }
}
