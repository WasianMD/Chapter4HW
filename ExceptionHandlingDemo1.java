package ExceptionHandling;

import java.util.InputMismatchException;

/**
 * class: ExceptionHandlingDemo1
 * file: ExceptionHandlingDemo1.java
 * description: this program will provide an example with exception case.
 * Then, we will see how this exception is handled by Exception.
 */
public class ExceptionHandlingDemo1 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        boolean continueInput = true;
        do {
            try {
                System.out.println("Enter an integer: ");
                int number = input.nextInt();
                continueInput = false;
                System.out.println("You entered  " + number);
            } catch (Exception e) {
                System.out.println(e + " is ocurred. Please try it gain. " +
                        "Please enter an integer. Not other characters.");
                input.nextLine();
            }
            finally{
                System.out.println("////END OF THE PROGRAM///");
            }

        }
        while(continueInput);
    }
}