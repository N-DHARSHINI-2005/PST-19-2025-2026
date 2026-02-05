package Student.java;


public class polymorphism {

    public static void main(String[] args) {
      display(); 
        
    }
public static void display() {

	 System.out.println(display1());
	 System.out.println(display2());
	 
}
    public static int display1() {
        int a = 20;
        return a;
    }
    public static int display2() {
        int b= 10;
        return b;
    }
}
