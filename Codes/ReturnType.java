import java.util.Scanner;

public class ReturnType {
    // public static int print(){
    //     System.out.println("Hello Mr.Khalane");
    //     System.out.println("Hello Mr.Khalane");
    //     System.out.println("Hello Mr.Khalane");
    //     return 3;
    // }
    // public static void main(String[] args) {
    //     print();
    // }

    public static int CalculateSum(int a,int b){
        int Sum = a + b;
        return Sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input No: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int Sum = CalculateSum(a, b);
        System.out.println("Sum of given No. is "+Sum);
    }
}
