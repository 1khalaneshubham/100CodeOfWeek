import java.util.*;

public class votingSystem {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a Age: ");

        int Age = scanner.nextInt();

        // Ternary Operator

        String result = Age >= 18 ? "Vote":"Can Not Vote";
        
        System.out.println(result);

        // if(Age >= 18)
        //     System.out.println("Vote");
        // else
        //     System.out.println("Can Not Vote");
        
    } 
}
