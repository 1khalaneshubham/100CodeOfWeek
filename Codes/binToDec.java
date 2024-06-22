import java.util.Scanner;

public class binToDec {
    public static void BIN(int n){
        int npow = 0;
        int dec = 0;
        while (n > 0) {
            int lastD = n % 10;
            dec = dec + (lastD * (int)Math.pow(2,npow));
            npow++;
            n = n / 10;
        }
        System.out.println("Decimal of "+n+ " is : " +dec);
    }
    public static void main(String[] args) {
        BIN(101);
        // System.out.println(BINTODEC(101));
    }
}
