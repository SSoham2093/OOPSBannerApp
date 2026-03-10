import java.util.Scanner;

class KmToMilesInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double kilometers;
        double conversionFactor = 1.6;

        System.out.print("Enter distance in km: ");
        kilometers = input.nextDouble();

        double miles = kilometers / conversionFactor;

        System.out.println("The total miles is " + miles +
                " mile for the given " + kilometers + " km");

        input.close();
    }
}


