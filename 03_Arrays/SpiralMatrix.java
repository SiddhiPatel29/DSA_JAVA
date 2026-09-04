import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        List<Integer> result = spiralOrder(matrix, n, m);
        System.out.println("The elements of the matrix in spiral order are:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static List<Integer> spiralOrder(int[][] matrix, int n, int m){
        List<Integer> list = new ArrayList<>();
        int top = 0, bottom = n - 1, left = 0, right = m - 1;
        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i <= bottom; i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}
