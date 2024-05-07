// Given two integer inputs number1 and number2, the objective is to
//  find the sum of all Number that lay in the given interval by writing a code to Find the Sum of the Numbers in a Given Range in Java Language.

public class sumOfNo {
    public static void main(String[] args) {
        
        int num1 = 12;
        int num2 = 15;
        int sum = 0;

        // Method 1: Using Brute Force
        // for(int i = num2; i >= num1; i--){
            // sum = sum + i;
        // }
        // System.out.println("The Sum of range is:"+sum);

        // Method 2:Using the Formula
        System.out.println(num2*(num2+1)/2-num1*(num1+1)/2+num1);
    }    
}
