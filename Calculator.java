import java.util.InputMismatchException;

public class Calculator {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        boolean calculation = false;
        do {
            try {
                System.out.println("Enter the first integer: ");
                int numberOne = input.nextInt();
                System.out.println("Enter the second integer: ");
                int numberTwo = input.nextInt();
                calculation = true;
            }
            catch (Exception e) {
                System.out.println(e + " has ocurred. Please try again. Please enter non-negative integers only.");
                input.nextLine();
            }
            finally{
                int sum = numberOne + numberTwo;
                System.out.println("The sum of your integers is " + sum);
            }

        }
        while(!calculation);
    }
}
