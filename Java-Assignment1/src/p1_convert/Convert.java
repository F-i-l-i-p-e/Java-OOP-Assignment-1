// Filipe Nogueira Santos - 200534531
//Obj Oriented Prog-Java

package p1_convert;

// class for methods
class Convert {
    // variable to store weight conversion
    private static double massResult;
    // variable to store temperature conversion
    private static double tempResult;


    // method to convert pound to kilogram ////////////////////////////////////////////////////
    private static double getKilogramValue(double pound) {
        // formula to convert pound to kilogram
        return pound / 2.2;
    }

    // method to convert kilogram to pound
    private static double getPoundValue(double kilogram) {
        // formula to convert kilogram to pound
        return kilogram * 2.2;
    }

    // method to convert Fahrenheit to Celsius
    private static double getCelsiusValue(double fahrenheit) {
        // formula to convert Fahrenheit to Celsius
        return (fahrenheit - 32) * 5 / 9;
    }

    // method to convert Celsius to Fahrenheit
    private static double getFahrenheitValue(double celsius) {
        // formula to convert Celsius to Fahrenheit
        return (celsius * 9 / 5) + 32;
    }


    // method to get temperature result ////////////////////////////////////////////////////
    public static double getTemperature(double temperature, int choice) {
        // if choice is 1, convert temperature from Celsius to Fahrenheit
        if (choice == 1) {
            tempResult = getFahrenheitValue(temperature);
        }
        // if choice is 2, convert temperature from Fahrenheit to Celsius
        else if (choice == 2) {
            tempResult = getCelsiusValue(temperature);
        }
        // print error message System.err.println for error log and set tempResult to 0
        else {
            System.err.println("Invalid Choice! Only 1 or 2 is allowed");
            tempResult = 0;
        }
        // return the temperature conversion result
        return tempResult;
    }


    // method to get weight result ////////////////////////////////////////////////////
    public static double getMass(double mass, int choice) {
        // if choice is 1, convert weight from kilogram to pound
        if (choice == 1) {
            massResult = getKilogramValue(mass);
        }
        // if choice is 2, convert weight from pound to kilogram
        else if (choice == 2) {
            massResult = getPoundValue(mass);
        }
        // if choice is different than 1 or 2, prints an error message and set
        // massResult to 0
        else {
            System.err.println("Invalid Choice! Only 1 or 2 is allowed");
            massResult = 0;
        }
        // return the mass conversion result
        return massResult;
    }
}