import java.util.*;
public class GreatestofThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number one: ");
        
        int Num1 = sc.nextInt();   
        
        System.out.println("Enter the Number Two: ");   
        
        int Num2 = sc.nextInt();   
        
        System.out.println("Enter the Number Three: ");   
        
        int Num3 = sc.nextInt();
        
        
        // Method 1
        // if(Num1 > Num2 && Num1 > Num3)
        // {
        //     System.out.println(Num1+" is Greatest Number");
        // }
        // else if(Num2 > Num3)
        // {
        //     System.out.println(Num2+" is Greatest Number");
        // }
        // else
        // {
        //     System.out.println(Num3+" is Greatest Number");
        // }


        // Method 2
        // Greatest(Num1, Num2, Num3);


        // Method 3
        // if(Num1 > Num2 && Num1 > Num3)
        // {
        //     System.out.println(Num1+" is Greatest Number");
        // }
        // else
        // {
        //     String temp = Num2 > Num3 ? Num2+" is Greatest Number" : Num3+" is Greatest Number";
        //     System.out.println(temp);
        // }


        // Method 4
        int result;
        result = Math.max(Num1,Math.max(Num2, Num3));
        System.out.println(result);

    }
    static void Greatest(int x,int y,int z){

        if(x > y && x > z)
        {
            System.out.println(x+" is Greatest Number");
        }
        else if(y > z)
        {
            System.out.println(y+" is Greatest Number");
        }
        else
        {
            System.out.println(z+" is Greatest Number");
        }
    }
}
