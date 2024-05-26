import java.util.*;
class PassbyValueforNonprimitives{
    public static void main (String[]args)
    {
        Integer[]array = new Integer[2];
        array[0] = 2;
        array[1] = 3;
        add (array);
        System.out.println ("Result from main: " + (array[0] + array[1]));
    }
    
    private static void add (Integer[]array)
    {
        array[0] = 10;
        System.out.println ("Result from method: " + (array[0] + array[1]));
    }
}

/*
In Java, all arguments are passed by value.
For non-primitive types like arrays or objects, the 
value being passed is the reference to the memory 
location where the data is stored. So, when you modify
 the contents of the array or object inside a method,
those changes are reflected outside the method because
you're modifying the actual data that the reference points
 to. This is why it may seem like pass by reference, but
technically it's still pass by value.
                                 -samj le bhai
*/ 

