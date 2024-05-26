import java.util.*;
public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Take a Option: ");
        int Option = sc.nextInt();

        switch (Option) 
        {
            case 1:
                System.out.println("Option A is Seleceted ");
                break;
            case 2:
                System.out.println("Option B is Seleceted ");
                break;
            case 3:
                System.out.println("Option C is Seleceted ");
                break;
            case 4:
                System.out.println("Option D is Seleceted ");
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }
}
