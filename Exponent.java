import java.util.Scanner;

public class Exponent 
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter an integer.");
      int number = scan.nextInt();
      scan.close();
      System.out.printf("The square of %d is %d. The cube of %d is %d.", 
         number, square(number), number, cube(number));
   }
   
   public static int square(int number)
   {
   return number * number;
   }
   
   public static int cube(int number)
   {
   return square(number) * number;
   }
}