import java.util.Scanner;
public class ExceptionHandling
{
   public static void main(String args[])
   {
      tryCatch exec = new tryCatch();
      //exec.singleTryCatch();
      //exec.singleTryMultipleCatch();
      //exec.nestedTryCatch();
      
      
      // Using try catch to handle the user-defined exception in the throwDemo() method.
      try{
         exec.throwDemo();
      }
      catch (Exception sc)
      {
         sc.printStackTrace();
      }
      
      
      //exec.throwsDemo();
      //exec.tryCatchFinally(); 
      
           
            
      System.out.println("Rest of the code executed");
   }
}
////////////////////////////////////////////////////////////////////////////////////////////////////
class tryCatch
{
   Scanner console = new Scanner(System.in);
///////////////////////////////////////////////////////////////////////////////////////////////////////   
   void singleTryCatch()
   {
      try{
         System.out.print("Enter the integer: ");
         int num = console.nextInt();
         System.out.println("\nThe integer entered by the user is " + num);
         num = 100/num;
         System.out.println("The new value of num is " + num);
      }
      
      catch (Exception sc)
      {
         System.out.println("Please Enter the integer value");
         System.out.println(sc.toString());
      }
   } 
///////////////////////////////////////////////////////////////////////////////////////////////////////////   
   void singleTryMultipleCatch()
   {
      try{
         System.out.print("Enter the integer: ");
         int num = console.nextInt();
         System.out.println("\nThe integer entered by the user is " + num);
         num = 100/num;
         System.out.println("The new value of num is " + num);
      }
      catch (ArithmeticException sc)
      {
         System.out.println("Please enter the value of integer greater than zero.");
         sc.printStackTrace();
      }    
      
      catch (Exception sc)
      {
         System.out.println("Please Enter the integer value");
         System.out.println(sc.toString());
      }
   } 
////////////////////////////////////////////////////////////////////////////////////////////////////////////   
   void nestedTryCatch()
   {
      try{
         System.out.print("Enter the integer: ");
         int rem;
         int num = console.nextInt();
         System.out.println("\nThe integer entered by the user is " + num);
         
            try{
               num = 100/num;
               rem = 100%num;
               System.out.println("The value of new num is: " + num);
               System.out.println("The value of rem is: " + rem);

            }
            // Input is 0, then ArithmeticException is met and this catch statement is executed and then the codes following it.
            catch (ArithmeticException sc){
               System.out.println(sc.toString());
            }
            System.out.println("After the inside catch statement executed in the program.");
      }
      catch (Exception sc){
         sc.printStackTrace();
      }
      // If input is other than integer, InputMismatchException is met and this above catch statement is executed and the print statement below is printed.
      System.out.println("After the outside catch statement executed in the program.");
   }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////   
   void throwDemo()
   {
         System.out.print("Enter the age: ");
         int age = console.nextInt();
         System.out.println("\nThe age entered by the user is " + age);
         if (age < 21)
            // Throwing the user defined exception. This exception is not considered as an exception by the program itself, so we made one ourself.
            throw new ArithmeticException("You are not eligible to drink");//Passing the string to a parametarized constructor.
         else
         System.out.println("You are eligible to drink.");
   }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////   
   void throwsDemo() throws ArithmeticException
   {
         System.out.print("Enter the age: ");
         int age = console.nextInt();
         System.out.println("\nThe integer entered by the user is " + age);
         if (age>21)
            System.out.println("You are eligible to drink");
         else
            throw new ArithmeticException ("You are not eligible to drink");
   }
//////////////////////////////////////////////////////////////////////////////////////////////////
   void tryCatchFinally()
   {
      try{
            System.out.print("Enter the age: ");
            int age = console.nextInt();
            System.out.println("\nThe age entered by the user is " + age);
            if (age>21)
               System.out.println("You are eligible to drink");
            else
               throw new Exception ("You are not eligible to drink");
      }
      catch (Exception sc){
         sc.printStackTrace();
      }
      // Finally will get executed irrespective of the try and catch.
      finally
      {
         System.out.println("Drinking restriction checked");
      }
   }     
}

