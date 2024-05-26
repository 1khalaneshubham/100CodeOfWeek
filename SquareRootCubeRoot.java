import java.util.*;
public class SquareRootCubeRoot {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        
        int Num = sc.nextInt();

        // System.out.println("Square Root of "+Num+" is :" +(SquareRoot(Num)));
        // System.out.println("Cube Root of "+Num+" is :" +(CubeRoot(Num)));
        

        System.out.println("Square Root of "+Num+" is :" + Math.sqrt(Num));
        System.out.println("Cube Root of "+Num+" is :" + Math.cbrt(Num));

    }
    static double SquareRoot(int x) 
    {
        double Squ;
        Squ = Math.sqrt(x);
        return Squ;
    }
    static double CubeRoot(int x)
    {
        double Cube;
        Cube = Math.cbrt(x);
        return Cube;
    }
}
