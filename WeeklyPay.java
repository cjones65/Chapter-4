import java.util.Scanner;

public class WeeklyPay
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the hourly pay rate.");
      double hourlyRate = scan.nextDouble();
      System.out.println("Enter number of regular hours.");
      double regularHours = scan.nextDouble();
      System.out.println("Enter number of overtime hours.");
      double overtimeHours = scan.nextDouble();
      
      System.out.printf("The gross pay for working %.2f reuglar hours and %.2f overtime hours " + 
      "at an hourly pay rate of $%.2f is $%,.2f.", regularHours, overtimeHours, hourlyRate, calculatePay(hourlyRate, regularHours, overtimeHours));     
   }
   public static double calculatePay(double regularHours, double hourlyRate, double overtimeHours)
   {
      return regularHours * hourlyRate + overtimeHours * 1.5 * hourlyRate;
   }
}