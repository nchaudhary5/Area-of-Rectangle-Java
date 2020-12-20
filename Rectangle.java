// Rectangle class that contains a length and width instance variable 
// and methods to set and get its value 
public class Rectangle 
{
    private double length;                         // instance length variable 
    private double width;                          // instance width variable 
    
    // method to set the length in the object 
    public void setLength(double l)
    {
        length = l;
    }
    
    // method to set the width in the object 
    public void setWidth(double w)
    {
        width = w;
    }
    
    // method to retrieve the length from the object 
    public double getLength()
    {
        // return value of length to caller 
        return length;
    }
    
    // method to retrieve the width from the object
    public double getWidth()
    {
        // return value of width to caller 
        return width;
    }
    
    // method to retreive the area from the object 
    public double getArea()
    {
        // return value of area to caller 
        return length * width;
    }
}