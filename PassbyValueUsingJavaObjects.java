import java.util.*;
public class PassbyValueUsingJavaObjects {
    public static void main(String[] args) {
        Integer a = 2;
        Integer b = 3;
        add(a,b);
        System.out.println("Result from main: " +(a+b));
    }
    
    private static void add(Integer a, Integer b){
    
        a = 10;
        System.out.println("Result from method: " +(a+b));
    }
}
      
    


