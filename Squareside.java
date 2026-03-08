import java.util.Scanner;

class SquareSide {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double perimeter;

        System.out.print("Enter perimeter of square: ");
        perimeter = input.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is "
                + side + " whose perimeter is " + perimeter);

        input.close();
    }
}

