public class Swap {
    public static void main(String[] args) {
        
        int a = 5;
        int b = 10;
        int c = 15;
        int d = 20;

        // Swap value
        int temp = a;
        a = b;
        b = c;
        c = d;
        d = temp;
        
        System.out.println(a);  // 10
        System.out.println(b);  // 15
        System.out.println(c);  // 20
        System.out.println(d);  // 5
    }
}
