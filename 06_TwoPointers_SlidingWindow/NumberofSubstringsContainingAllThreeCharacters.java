import java.util.Scanner;

public class NumberofSubstringsContainingAllThreeCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        int count = numberOfSubstrings(s);
        System.out.println("Number of substrings containing all three characters: " + count);
    }
    public static int numberOfSubstrings(String s){
        int count = 0;
        int[] lastIndex = {-1, -1, -1};
        for(int i = 0; i < s.length(); i++){
            lastIndex[s.charAt(i) - 'a'] = i;
            if(lastIndex[0] != -1 && lastIndex[1] != -1 && lastIndex[2] != -1){
                count = count + Math.min(lastIndex[0], Math.min(lastIndex[1], lastIndex[2])) + 1;
            }
        }
        return count;
    }
}
