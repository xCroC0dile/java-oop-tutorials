
// Java code
public class Label_Break1 {
 
    public static void main(String[] args)
    {
 
        boolean t = false;
    first : {
    second : {
    third : {
        System.out.println("Before the break");
        if (t) // break out of second block
            break second;
    }
        System.out.println("This won't execute");
    }
        System.out.println("This is after the second block");
    }
    }
}