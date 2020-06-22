package exercises;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class MilesPerGallon {
    //double miles; // Miles driven
   // double gallons; // Gallons of fuel
   // double mpg; // Miles-per-gallon
    public static void main(String[] args) {
        // Create a scanner object for keyboard input
        Scanner input = new Scanner(System.in);
        System.out.println("this program will calculate miles per gallon");
        //get the miles driven
        System.out.println("Enter the miles driven: ");
       double miles = input.nextDouble();
        // Get gallons of fuel
        System.out.print("Enter the gallons of fuel used: ");
       double gallons = input.nextDouble();

        // call calculateMilesPerGallon to run calculation
       double mpg = calculateMilesPerGallon(miles, gallons);

        // Display the miles-per-gallon.
        System.out.print("The miles-per-gallon is " + mpg);

    }
    static double calculateMilesPerGallon(double miles, double gallons){
        return miles/gallons;
    }
}
