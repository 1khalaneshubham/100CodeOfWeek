import java.util.*;
public class OneDarrayCode1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Array Value: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");

        // for(int i = 0; i < n; i++){
        //     arr[i] = sc.nextInt();
        // }

        // System.out.print("\nArray elements are :\n");
        // for(int i = 0; i < n; i++){
        //     System.out.println(arr[i]+ " ");
        // }

        int i = 0;
        while(i < n){
            arr[i]=sc.nextInt();
            i++;
        }
        System.out.print("\nArray Elements are : \n");
        for(i = 0; i < n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}

