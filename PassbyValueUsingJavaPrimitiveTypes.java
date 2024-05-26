import java.util.*;
public class PassbyValueUsingJavaPrimitiveTypes {
    public static void main(String[] args) {
        
        int a = 2;
        int b = 3;
        
        add(a,b);
        
        System.out.println("Result from main: " +(a+b));
    }
    
    private static void add(int a, int b){
        
        a = 10;  // pass by value
        
        System.out.println("Result from method: " +(a+b));
    }
}
