import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of characters: ");
        int n = sc.nextInt();
        Character chars[] = new Character[n];
        System.out.print("Enter the cahracters: ");
        for(int i = 0; i < n; i++){
            chars[i] = sc.next().charAt(0);
        }

        int result = stringCompression(chars);
        System.out.println(result);
    }
    public static int stringCompression(Character chars[]){
        int read = 0, write = 0;
        while(read < chars.length){
            char current = chars[read];
            int count = 0;

            while(read < chars.length && chars[read] == current){
                read++;
                count++;
            }

            chars[write++] = current;

            if(count > 1){
                String countstr = String.valueOf(count);

                for(char c : countstr.toCharArray()){
                    chars[write++] = c;
                }
            }
        }
        return write;
    }
}
