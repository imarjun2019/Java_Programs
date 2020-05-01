import java.util.Scanner;
import java.lang.Math;
class Armstrong
{
   int check (int n)
   {
      // Armstrong number is that number whose each digit cubic sum equals to the number itself (i.e. 153 = 1^3+5^3+3^3 =153).
      int q,r,sum=0,p;
      do
      {
         r = n % 10;
         p = (int)Math.pow(r,3);
         sum = sum + p;
         n = n/10;
      }while(r>0);
      
      return sum;
   }
}
   
class ArmstrongNumber
{
   public static void main (String args[])
   {
      Armstrong check = new Armstrong();
      Scanner console = new Scanner(System.in);
      String choice, user_input;
      do
      {
         System.out.printf("\nEnter the number to check whether it is Armstrong number or not: ");
         int num = console.nextInt();
         int arm_check = check.check(num);
         System.out.println("arm_check = "+arm_check);
         if (num == arm_check)
         {
            System.out.println("\n"+num+" is a armstrong number");
         }
         else
         {
            System.out.println("\n"+num+" is not a armstrong number");
         }  
         System.out.print ("\nPress any key to check for another number or press n to exit out: ");
         user_input = console.next();
         choice = user_input.toUpperCase();
         
      }while(!choice.equals("N"));
      System.out.println("Thank you for using the program.");
   }
}