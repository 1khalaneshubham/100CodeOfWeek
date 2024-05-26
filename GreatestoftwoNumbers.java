import java.util.*;

public class GreatestoftwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number One: ");
        int Num1 = sc.nextInt();
        System.out.println("Enter a number Two: ");
        int Num2 = sc.nextInt();

        // Method 1
       
        // if(Num1 == Num2)
        // {
        //     System.out.println("Give both Number are equle : "+Num1);
        // } else if(Num1 > Num2) {
        //     System.out.println("Give Number "+Num1+" is Greatest Number");
        // }else{
        //     System.out.println("Give Number "+Num2+" is Greatest Number");
        // }

         // Method 2
        //  Greatest(Num1, Num2);

        // Method 3
        if(Num1 == Num2)
        {
            System.out.println("Give both Number are equle : "+Num1);
        }else{
            String temp = Num1 > Num2 ? "Number "+Num1+" is Greatest":"Number "+Num2+" is Greatest";
            System.out.println(temp);
        }


    }
    static void Greatest(int x,int y)
    {
        if(x == y)
        {
            System.out.println("Give both Number are equle : "+x);
        } 
        else if(x > y) 
        {
            System.out.println("Give Number "+x+" is Greatest Number");
        }
        else
        {
            System.out.println("Give Number "+y+" is Greatest Number");
        }
    }
}
