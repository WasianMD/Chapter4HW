public class RandomArray {
    public static void main(String[] args) {
        double[] random = {};
        for (int i = 0; i < 50; i++) {
         random[i] = rd.nextDouble(); 
      }
        java.util.Scanner input = new java.util.Scanner(System.in);
            try {
                System.out.println("Enter a number between 1 and 50 and see what number you get: ");
                int index = input.nextInt();
                System.out.println(random[index]);
            }
        catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                e.printStackTrace();
                input.nextLine();
            }
    }
}
