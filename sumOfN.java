// Program to Find the Sum of First N Natural Numbers using java

public class sumOfN {
    public static void main(String[] args) {
        int n = 10;
        int num = 0;
        int sum = getSum(n);
        System.out.println(sum);

        // Methad-1
        // for(int i = n; i > 0; i--){
        //     num = num + i;
        // }
        // System.out.println(num);

        // Methad-2

        // System.out.println(n*(n+1)/2);  // Standard formula aahe bahi

        // // Methad-3 Using Recursion
    }
        static int getSum( int n){
            if(n == 0)
                return n;

            return n + getSum(n-1);
    }
}
