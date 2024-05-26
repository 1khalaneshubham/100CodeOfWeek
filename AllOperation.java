import java.util.*;
public class AllOperation {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a value of X: ");
        int x = sc.nextInt();
        
        System.out.print("Enter a value of Y: ");
        int y = sc.nextInt();

        System.out.println("Sum of "+ x +" and "+y+"is : "+
        (Add(x,y)));

        System.out.println("Subtract of "+ x +" and " +y+ " is :"+
        (Subtract(x,y)));
        
        System.out.println("Multiply of "+ x +" and " +y+ " is : "+
        (Multiply(x,y)));
        
        System.out.println("Divison of "+ x +" and "+y+" is : "+
        (Divison(x,y)));
        
        System.out.println("Modulo of "+ x +" and " +y+ " is : "+
        (Modulo(x,y)));
        
    }
    static int Add(int x,int y){
        int sum;
        sum = x + y;
        return sum;
    }
    static int Subtract(int x,int y){
        int sub;
        sub = x - y;
        return sub;
    }
    static int Multiply(int x,int y){
        int mult;
        mult = x * y;
        return mult;
    }
    static int Divison(int x,int y){
        int div;
        div = x / y;
        return div;
    }
    static int Modulo(int x,int y){
        int modul;
        modul = x % y;
        return modul;
    }
}

