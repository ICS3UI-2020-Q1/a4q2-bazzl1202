import java.util.Scanner;
/**
 * Asks for positive integer when negative integer is entered code stops
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

   // declare the variable
   int posInt;

    do{
      // ask the user to enter an integer
      System.out.println("Please enter a positive integer. Enter a negative integer to quit.");
      // initialize variable
      posInt = input.nextInt();
    }while(posInt >= 0);
    // tell the user the code is done
    System.out.println("All done!");
  }
}
