public class Factorial {
    public static int Fact(int n){
        int f = 1;
        for(int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;
    }
    public static void main(String[] args) {
        // Fact(5);
        System.out.println(Fact(5));
    }
}
