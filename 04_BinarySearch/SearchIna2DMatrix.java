import java.util.Scanner;

public class SearchIna2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); System.out.print("Enter the size of rows in array: "); 
        int n = sc.nextInt(); 
        
        System.out.print("Enter the size of columns in array: "); 
        int m = sc.nextInt(); 
        
        int arr[][] = new int[n][m]; 
        System.out.print("Enter the elements of array: "); 
        for (int i = 0; i < n; i++) { 
            for(int j = 0; j < m; j++){ 
                arr[i][j] = sc.nextInt(); 
            } 
        } 

        System.out.print("enter the element you want to search: ");
        int target = sc.nextInt();
        
        boolean result = searchMatrix(arr, n, m, target); 
        System.out.print(result);
    }
    public static boolean searchMatrix(int arr[][], int n, int m, int target){
        int low = 0, high = n * m - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            int row = mid / m;
            int col = mid % m;
            if(arr[row][col] == target) return true;
            else if(arr[row][col] < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}
