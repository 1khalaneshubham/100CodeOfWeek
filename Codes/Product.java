import java.util.Scanner;

public class Product {
    public static int Prod(int a,int b){
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        int Output = Prod(num1,num2);

        System.out.println("Num1 * Num2 : "+Output);
    }
}
