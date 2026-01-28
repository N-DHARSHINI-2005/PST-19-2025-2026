import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int length = 0;
        char[] arr = str.toCharArray(); 
        for(char c : arr)
            length++;

        System.out.println("Length of string: " + length);
    }
}
