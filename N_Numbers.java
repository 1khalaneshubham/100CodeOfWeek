import java.util.*;

public class N_Numbers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a Number: ");
        
        int num = scanner.nextInt();
        
        int i = 1;

        // while (i <= num) {
        //     System.out.print(i + " ");
        //     i++;
        // }


        // for(int i = 1; i <= num; i++){  // if input pass 0 than output is null
        //     System.out.print(i + " ");
        // }

        do{                                // if input pass 0 than output is 1
            System.out.print(i + " ");
            i++;
        }while(i <= num);
    }
}
