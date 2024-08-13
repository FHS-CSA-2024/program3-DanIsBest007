//Program 3
// Code By Dan The Man 8/13/24
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
class Program3
{
    public static void main(String[] args)
    {
        Scanner scannerObj = new Scanner(System.in); // creates scanner obj
        
        System.out.print("Enter the length: ");
        int rectangleLength = scannerObj.nextInt(); // gets input for length
        
        System.out.print("Enter the width: ");
        int rectangleWidth = scannerObj.nextInt(); // gets input for width
        
        int rectangleArea = rectangleLength * rectangleWidth;
        int rectanglePerimeter = rectangleLength * 2 + rectangleWidth * 2;
        
        System.out.println("The length is " + rectangleLength);
        System.out.println("The width is " + rectangleWidth);
        System.out.println("The area is " + rectangleArea);
        System.out.println("The perimeter is " + rectanglePerimeter);
        
        
    }
}

//Paste console output below:
/*
    Enter the length: 194
    Enter the width: 42
    The length is 194
    The width is 42
    The area is 8148
    The perimeter is 472
*/
