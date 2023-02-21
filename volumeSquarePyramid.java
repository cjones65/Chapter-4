import java.util.Scanner;

public class volumeSquarePyramid
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a double value for the base.");
      double base = scan.nextDouble();
      System.out.println("Enter a double value for the height.");
      double height = scan.nextDouble();
      scan.close();
      
      System.out.printf("The volume of the pyramid this base %.2f and height %.2f " +
         "is %.2f.", base, height, calcVolume(base, height));
   }
   
   public static double calcVolume(double base, double height)
   {
      return (1.0 / 3.0) * (base * base) * height;
   }
}