import java.util.*;

public class LearningBreakStatement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Strating Number: ");
        
        int Start = sc.nextInt();
        
        System.out.print("Enter Ending Number: ");
        
        int End = sc.nextInt();
    
        // for loop
        
        for(int i = Start; i <= End; i++){
            
            System.out.print(i+ " ");
            
            if(i % 13 == 0){
                break;
            }
            // i++;
        }


        // While Loop

        // int i = Start;

        // while (i <= End) 
        // {
            
        //     System.out.print(i + " ");
            
        //     if( i % 13 == 0){
        //         break;
        //     }
        //     i++;
        // }
    }
}
