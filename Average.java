import java.util.Scanner;

public class Average
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter an integer.");
      int integerOne = scan.nextInt();
      System.out.println("Enter another Integer.");
      int integerTwo = scan.nextInt();
      
      System.out.printf("The average of %d and %d is %.2f.", integerOne, integerTwo, 
         calcAverage(integerOne, integerTwo));
      
   }
   public static double calcAverage(int integerOne, int integerTwo)
   {
      return (integerOne + integerTwo) / 2.0;
   }
}