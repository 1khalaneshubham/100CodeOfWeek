import java.util.*;
class TwoDCode
{
    public static void main (String[]args)
  {
      Scanner sc = new Scanner (System.in);
      System.out.print ("Enter number of Rows ");
      int n = sc.nextInt ();
      System.out.print ("Enter number of Columns ");
      int m = sc.nextInt ();
      
      int arr[][] = new int[n][m];

      System.out.println ("Enter the items in the 2D array: ");
    for (int i = 0; i < n; i++)
      {
	for (int j = 0; j < m; j++)
    {
        arr[i][j] = sc.nextInt ();
    }
}

System.out.println ("The items in the 2D array are : ");
//Loop through the array by incrementing value of i
for (int i = 0; i < n; i++)
{
    for (int j = 0; j < m; j++)
    {
        System.out.print (arr[i][j] + " ");
    }
	System.out.println ();
}
}
}
