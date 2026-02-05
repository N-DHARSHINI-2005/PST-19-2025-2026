package Student.java;

public class Method {

    public static void main(String[] args) {
    	int a=10,b=20, c=30;
    	 System.out.println(Method1(a,b));
    	 System.out.println(Method2(a,b,c));
    }

    public static int Method1(int a,int b) {
        
        return a+b;
    }
    public static int Method2(int a,int b,int c) {
        
        return a+b+c;
    }
}
