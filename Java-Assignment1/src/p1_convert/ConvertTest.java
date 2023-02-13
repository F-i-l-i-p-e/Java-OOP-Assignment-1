// Filipe Nogueira Santos - 200534531
//Obj Oriented Prog-Java


package p1_convert;

// Import the Scanner class from the java.util package
import java.util.Scanner;

public class ConvertTest {


    public static void main(String[] args) {
        // Start scanner
        Scanner input = new Scanner(System.in);
        // Declare three variables to store the user's choices
        int choice;
        double value;
        int option;


        // Ask input 1 for weight conversion or 2 for temperature conversion ////////////////////////////////////////////////////
        System.out.print("Conversion app: choose ''1' for Weight, or ''2''' for Temperature: ");
        choice = input.nextInt();


        // If the user entered 1, then perform weight conversion ////////////////////////////////////////////////////
        if (choice == 1) {
            // Ask user for input for weight, add input to value
            System.out.print("Enter a value for the weight conversion: ");
            value = input.nextDouble();
            // Ask user input '1' to convert LB to KG or '2' to convert KG
            System.out.print("Choose ''1'' to convert LB to KG, or ''2'' for KG to LB: ");
            option = input.nextInt();


            // Use a switch statement to handle the user's choice for weight conversion
            switch (option) {
                // Case 1 ask input and choice 1 from .getmass method converting LB to KG
                case 1:
                    System.out.println(
                            value + " Pounds (LB) is equivalent to " + Convert.getMass(value, 1) + " Kilos (KG).");
                    break;
                // Case 2 ask input and choice 2, from.getmass method converting KG to LB
                case 2:
                    System.out.println(
                            value + " Kilos (KG) is equivalent to " + Convert.getMass(value, 2) + " Pounds (LB)");
                    break;
                // default for invalid number input
                default:
                    System.err.println("Error. Please, enter a valid number!");
                    break;
            }
        }


        // If the user entered 2, then perform temperature conversion ////////////////////////////////////////////////////
        else if (choice == 2) {
            System.out.print("Enter a value for the temperature conversion: ");
            value = input.nextDouble();
            System.out.print("Choose ''1'' to convert C to F, or ''2'' for F to C: ");
            option = input.nextInt();

            switch (option) {
                // Case 1 ask input and choice 1 from .getTemperature method converting C to F
                case 1:
                    System.out.println(value + " Celsius (C) is equivalent to " + Convert.getTemperature(value, 1)+ " Fahrenheit (F).");
                    break;
                // // Case 2 ask input and choice 2 from .getTemperature method convert F to C
                case 2:
                    System.out.println(value + " Fahrenheit (F) is equivalent to " + Convert.getTemperature(value, 2)+ " Celsius (C).");
                    break;
                // default for invalid number input
                default:
                    System.err.println("Error. Please, enter a valid number!");
                    break;
            }
        }
        // else statement for error
        else {
            System.err.println("Error. Please, enter a valid number!");
        }
        // close scan
        input.close();
    }
}