/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main{
       public static void main(String[] args) {
    
        InformationTechnology1 myObj = new InformationTechnology1();
        myObj.displayPart1();
        myObj.displayPart2();
        myObj.displayPart3();
        myObj.displayPart4();
        
        InformationTechnology2 myObj2 = new InformationTechnology2();
        myObj2.methodA();
        myObj2.methodB();
        myObj2.methodC();
        myObj2.methodD();
    }
      
  }
  class InformationTechnology1 {
    public void displayPart1() {
        System.out.println("IT1: Python");
    }

    public void displayPart2() {
        System.out.println("IT1: C programming");
    }

    public void displayPart3() {
        System.out.println("IT1: web essentisl");
    }

    public void displayPart4() {
        System.out.println("IT1:Cyber Security");
    }
}

class InformationTechnology2 {
    public void methodA() {
        System.out.println("IT2: DSA"); 
        
    }
    public void methodB() {
        System.out.println("IT2:  OOPS"); 
        
    }
    public void methodC() {
        System.out.println("IT2: DBMS");
        }
    public void methodD() {
        System.out.println("IT2: CN"); 
        
    }
}
