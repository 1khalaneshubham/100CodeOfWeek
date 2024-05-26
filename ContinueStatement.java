import java.util.*;
public class ContinueStatement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Numbers: ");
        
        int Start = sc.nextInt();
        
        int End = sc.nextInt();

        for(int i = Start; i <= End; i++){
            
            // System.out.print(i+ " ");
            
            if(i%5 == 0){

                continue;
            }
            System.out.print(i+ " ");
        }
        
    }
}
