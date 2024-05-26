import java.util.*;

public class CheckingOddOrEven {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int x = sc.nextInt();

        // if(x % 2 == 0){
        //     System.out.println("Given Number is Even");
        // }else{
        //     System.out.println("Given Number is Odd");
        // }

        String temp = x % 2 == 0 ? "Even":"Odd";
        System.out.println(temp);
    }    
}
