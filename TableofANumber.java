import java.util.*;

public class TableofANumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        // Table(num);

        // case 3
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " * " + i + " = " +i*num);
        }
    }
    static void Table(int x){
    // case 1
    //     for(int i = 1; i <= 10; i++)
    //     {
    //         System.out.println( x +" * "+ i + " = " + i * x);
    //     }

    // case 2
    // int i = 1;

    // while (i <= 10) {
    //     System.out.println(x +" * "+ i + " = " + i * x);
    //     i++; 
    // }
}
}


