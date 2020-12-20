import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        // Create scanner to obtain input from command line 
        Scanner input = new Scanner(System.in);
        
        // Create an area object and assign it to box 
        Rectangle box = new Rectangle();
        
        // prompt 
        System.out.print("Please enter the length:\n");  
        // read value from user 
        double l = input.nextDouble();
        // put length in box
        box.setLength(l);
        
        // prompt 
        System.out.println("Please enter the width: ");
        // read value from user 
        double w = input.nextDouble();
        // put width in box 
        box.setWidth(w);
        
        // display the area 
        System.out.printf("The area is: %.2f", box.getArea());
        
    }   // end method main 
}   // end class Main 




