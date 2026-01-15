import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("This program is designed to exhibit the positive divisors of");
        System.out.println("positive integers supplied by you.");
        
        while (true) {
            System.out.print("\nEnter a positive integer: ");
            int number = input.nextInt();

            if (number <= 0) {
                System.out.println("Input is unacceptable. Program terminated.");
                break;
            }

            System.out.println("The divisors of " + number + " in decreasing order are:");
            for (int i = number; i >= 1; i--) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
