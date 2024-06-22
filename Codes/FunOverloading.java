public class FunOverloading {
    public static int Sum(int a,int b,int c){
        return a+b+c;
    }
    public static float Sum(int a,int b){
        return a+b;
    }
    public static double Sum(int a,int b,int c,int d){
        return a+b;
    }
    public static void main(String[] args) {
     System.out.println(Sum(10, 20));   
     System.out.println(Sum(10, 20, 30));   
     System.out.println(Sum(10, 20, 30,40));   
    }
}
