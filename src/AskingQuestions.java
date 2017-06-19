import java.util.Scanner;

public class AskingQuestions 
{ 
  public static void main( String[] args ) 
  { 
	  // Input output 1
    Scanner keyboard = new Scanner(System.in);
//
//    double n1, n2, n3;
//
//    System.out.print( "First number? " );
//    n1 = keyboard.nextDouble();
//
//    System.out.print( "Second number? " );
//    n2 = keyboard.nextDouble();
//
//    System.out.print( "Third number? " );
//    n3 = keyboard.nextDouble();
//    
//    System.out.println("The total is : " + (n1 + n2 + n3));
//    
//    
	  
	  //input output 2
    double num1, num2, num3;

    System.out.print( "First temperature? " );
    num1 = keyboard.nextDouble();

    System.out.print( "Second temperature? " );
    num2 = keyboard.nextDouble();

    System.out.println("The max value is : " + ((num1 +num2)/2));
  }
 
}
