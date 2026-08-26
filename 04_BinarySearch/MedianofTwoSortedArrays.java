import java.util.Scanner;

public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n1 = sc.nextInt();

        int arr1[] = new int[n1];
        System.out.print("Enter the elements of first array: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of array: ");
        int n2 = sc.nextInt();

        int arr2[] = new int[n2];
        System.out.print("Enter the elements of second array: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        double result = findMedian(arr1, arr2);
        System.out.print(result);
    }
    public static double findMedian( int arr1[], int arr2[]){
        int n1 = arr1.length;
        int n2 = arr2.length;
        if(n1 > n2) return findMedian(arr2, arr1);
        int low = 0, high = n1;
        int left = (n1 + n2 + 1) / 2;
        int n = n1 + n2;
        while (low <= high) {
            int mid1 = (low + high) / 2;
            int mid2 = (left - mid1);
            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;
            if(mid1 < n1) r1 = arr1[mid1];
            if(mid2 < n2) r2 = arr2[mid2];
            if(mid1 - 1 >= 0) l1 = arr1[mid1 - 1];
            if(mid2 - 1 >= 0) l2 = arr2[mid2 - 1];
            if(l1 <= r2 && l2 <= r1){
                if(n % 2 == 1) return Math.max(l1, l2);
                return ((double)(Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
            }
            else if(l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0;
    }
}
