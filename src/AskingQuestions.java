import java.util.Scanner;

public class AskingQuestions 
{ 
  public static void main( String[] args ) 
  { 
    Scanner keyboard = new Scanner(System.in);

    double num1, num2, num3;

    System.out.print( "First number? " );
    num1 = keyboard.nextDouble();

    System.out.print( "Second number? " );
    num2 = keyboard.nextDouble();

    System.out.print( "Third number? " );
    num3 = keyboard.nextDouble();
    
    System.out.println("The total is : " + (num1 + num2 + num3));
  }
 
}
