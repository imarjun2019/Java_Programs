import java.util.Scanner;
public class ThrowsDemoWithClass{
   public static void main (String args[]) throws Exception{
         Scanner console = new Scanner(System.in);
         System.out.print("Enter the age: ");
         int age = console.nextInt();
         System.out.println("\nThe integer entered by the user is " + age);
         if (age>21)
            System.out.println("You are eligible to drink");
         else
            throw new Drink ("You are not eligible to drink");        
   }
}

class Drink extends Exception{
   Drink (String exception){
      System.out.println(exception);
   }  
}
            
         
