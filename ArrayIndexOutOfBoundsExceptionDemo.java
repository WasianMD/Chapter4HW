package ExceptionHandling;

/**
 * The purpose of this demo is to show the OutOfBoundsException  for an array
 * value.
 * This will show how the exception is handled and return an output to the user.
 */
public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        int[] list = {1,2,3,4};
        java.util.Scanner input = new java.util.Scanner(System.in);
            try {
                System.out.println("Enter the last index number. ");
                int lastIndex = input.nextInt();
                System.out.println(list[lastIndex]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                e.printStackTrace();
                input.nextLine();
            }
    }
}
