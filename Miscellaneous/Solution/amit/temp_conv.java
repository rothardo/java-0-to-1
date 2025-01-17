import java.util.Scanner;
public class temp_conv {
    public static void main (String[] args){
                Scanner scanner = new Scanner(System.in);

                System.out.println("Temperature Converter");
                System.out.println("Select the input unit:");
                System.out.println("1. Celsius");
                System.out.println("2. Fahrenheit");
                System.out.println("3. Kelvin");

                int inputUnit = scanner.nextInt();

                System.out.println("Select the output unit:");
                System.out.println("1. Celsius");
                System.out.println("2. Fahrenheit");
                System.out.println("3. Kelvin");

                int outputUnit = scanner.nextInt();

                System.out.print("Enter the temperature value: ");
                double inputValue = scanner.nextDouble();

                double result = 0;

                // Convert temperature based on input and output units
                if (inputUnit==1) {
                    if (outputUnit==1) {
                        result=inputValue;
                    } else if (outputUnit==2) {
                        result = inputValue*9 / 5 + 32;
                    } else if (outputUnit==3) {
                        result = inputValue + 273.15;
                    }
                } else if (inputUnit == 2) {
                    if (outputUnit == 1) {
                        result = (inputValue - 32) * 5 / 9;
                    } else if (outputUnit == 2) {
                        result = inputValue;
                    } else if (outputUnit == 3) {
                        result = (inputValue - 32) * 5 / 9 + 273.15;
                    }
                } else if (inputUnit == 3) {

                    if (outputUnit == 1) {
                        result = inputValue - 273.15;
                    } else if (outputUnit == 2) {
                        result = (inputValue - 273.15) * 9 / 5 + 32;

                    } else if (outputUnit == 3) {
                        result = inputValue;
                    }
                } else {
                    System.out.println("Invalid input unit!");
                    return;
                }
                System.out.printf("Converted temperature: %.2f%n", result);

    }
}
