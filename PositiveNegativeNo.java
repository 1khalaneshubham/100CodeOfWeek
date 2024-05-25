import java.util.*;

public class PositiveNegativeNo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = sc.nextInt();

        // loop 
        // if(num == 0){
        //     System.out.println("Zero");
        // }else if(num > 0){
        //     System.out.println("Postive No ");
        // }else{
        //     System.out.println("Negative No ");
        // }

        // nested loop
        // if(num >= 0){
        //     if(num == 0){
        //         System.out.println("Zero");
        //     }else{
        //         System.out.println("Postive No");
        //     }
        // }else{
        //     System.out.println("Negative No");
        // }

        if (num == 0){
            System.out.println("Zero");
        }else{
            String temp = num > 0 ? "postive No": "Negative No";
            System.out.println(temp);
        }
    }    
}
