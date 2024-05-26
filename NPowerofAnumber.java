import java.util.*;
public class NPowerofAnumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a base value: ");
        int base = obj.nextInt();

        System.out.print("Enter a expo value: ");
        int exp = obj.nextInt();

        // // Method 1
        // System.out.println("Power of "+base+" is : "+(Math.pow(base,exp)));
        
        // // Method 2
        // Power(base,exp);
        
        // // Method 3
        double result = 1;

        while (exp != 0) 
        {
            result = result * base;
            --exp;
        }
        System.out.println("Power of "+base+" is : "+result);
        
    }
    static void Power(int x,int y)
    {
        System.out.println("Power of "+x+" is : "+(Math.pow(x, y)));
    }
}
