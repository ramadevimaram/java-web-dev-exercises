package exercises;
import java.net.StandardSocketOptions;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width of Rectangle: ");
        double length = input.nextDouble();
        System.out.println("Enter the length of the Rectangle: ");
        double width = input.nextDouble();
        double area = length * width;
        //Area = length*width;
        System.out.println("Area of Rectangle is: " + area);
    /* User do not enter the values -- pre defined values
        double length = 4.5;
        double width = 8.0;
        double area = length*width;
        System.out.println("Area of Rectangle is:"+area);
     */

      }
    }

