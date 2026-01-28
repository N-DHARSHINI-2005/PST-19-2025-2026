public class Main {
    public static void main(String[] args) {

        int n = 121;        
        int temp = n;      
        int rev = 0;      
        while (n > 0) {
            rev = rev * 10 + (n % 10);  
            n = n / 10;                 
        }

        if (temp == rev) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
}

