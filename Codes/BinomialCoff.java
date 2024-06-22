public class BinomialCoff {
    public static int factorial(int a){
        int f = 1;
        for(int i = 1; i <= a; i++){
            f = f * i;
        }
        return f;
    }
    public static int BinCoff(int n,int r){
        int fn = factorial(n);
        int fr = factorial(r);
        int fnmr = factorial(n-r);
        int BinomialCof = fn / (fr*fnmr);

        return BinomialCof;
    }
    public static void main(String[] args) {
        // BinCoff(5, 2);
        System.out.println(BinCoff(10,5));

        // Inbuilt Method
        System.out.println(Math.pow(10, 3));
        System.out.println(Math.min(10, 3));
        System.out.println(Math.max(10, 3));
        System.out.println(Math.sqrt(10));
    
    }
}
