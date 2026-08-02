import java.util.HashMap;
import java.util.Scanner;

public class FrequencyCount {
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

        for(Integer key : map.keySet()){
            System.out.println(key + "->" + map.get(key));
        }

        // Array with Characters

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // Character arr[] = new Character[n];
        // for(int i = 0; i < n; i++){
        //     arr[i] = sc.next().charAt(0);
        // }

        // HashMap<Character, Integer> map = new HashMap<>();

        // for(int i = 0; i < arr.length; i++){
        //     map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        // }

        // for(Character key : map.keySet()){
        //     System.out.println(key + "->" + map.get(key));
        // }
    }
}
