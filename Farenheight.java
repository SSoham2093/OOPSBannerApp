                LEVEL 3
import java.util.Scanner;

class CelsiusToFahrenheit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double celsius;

        System.out.print("Enter temperature in Celsius: ");
        celsius = input.nextDouble();

        double fahrenheitResult = (celsius * 9 / 5) + 32;

        System.out.println("The " + celsius +
                " celsius is " + fahrenheitResult + " fahrenheit");

        input.close();
    }
}

