public class Question01 {
    public static void main(String[] args) {
        double[] myList = {5.8, 2.6, 9.0, 3.4, 7.1};

        System.out.println("Original Array:");
        printArray(myList);
      
        reverse(myList);
        System.out.println("\nReversed Array:");
        printArray(myList);
    }
    public static void reverse(double[] list) {
        int left = 0;
        int right = list.length - 1;

        while (left < right) {
            double temp = list[left];
            list[left] = list[right];
            list[right] = temp;

            left++;
            right--;
        }
    }
    public static void printArray(double[] list) {
        for (double value : list) {
            System.out.print(value + "  ");
        }
        System.out.println();
    }
}

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
