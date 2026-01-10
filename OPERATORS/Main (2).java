/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
public class Main{
    public static void main(String[] args) {
        int a = 5;


        System.out.println("Post-decrement:");
        System.out.println("a = " + a);       
        System.out.println("a-- = " + (a--)); 
        System.out.println("After a--: " + a);

       int b = 6;        
        System.out.println("Pre-decrement:");
        System.out.println("a = " + b);       
        System.out.println("a-- = " + (--b)); 
        System.out.println("After a++: " + b);
    }
}
