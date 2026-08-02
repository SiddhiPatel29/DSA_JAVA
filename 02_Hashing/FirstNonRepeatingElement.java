import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int value = map.get(key);

            if(value == 1){
                found = true;
                System.out.println(key);
                break;
            }
        
        }
        if(!found){
            System.out.println("No non-repeating element");
        }

    }
}
