
import java.util.HashMap;
import java.util.Scanner;

public class HighestFrequencyElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int maxFrequency = 0;
        int keyWithMaxFrequency = 0;
        for(Integer key : map.keySet()){
            if(maxFrequency < map.get(key)){
                maxFrequency = map.get(key);
                keyWithMaxFrequency = key;
            }
        }

        System.out.println(keyWithMaxFrequency + "->" + maxFrequency);
    }
}
