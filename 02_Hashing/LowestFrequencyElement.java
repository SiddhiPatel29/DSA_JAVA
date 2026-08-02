import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LowestFrequencyElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int minFrequency = arr.length;  // or Integer.MAX_VALUE
        int keyWithMinFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(minFrequency > entry.getValue()){
                minFrequency = entry.getValue();
                keyWithMinFrequency = entry.getKey();
            }
        }

        System.out.println(keyWithMinFrequency + "->" + minFrequency);
    }
}
