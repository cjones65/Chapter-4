import java.util.Scanner;

public class Eggs
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a number of eggs.");
      int eggs = scan.nextInt();
      scan.close();
      
      System.out.printf("There are %d dozens of eggs.", dozenEggs(eggs));
   }
   
   public static int dozenEggs(int eggs)
   {
      return eggs / 12;
   }
}