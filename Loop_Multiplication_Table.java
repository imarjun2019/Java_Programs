// This program prints out the multiplication table of the integer that user wants to display using three methods of their choice.
import java.util.Scanner;
class Multiplication
{
      // Method using the while loop.
      void mTable_while(int n)
      {
         int i = 1, m;  
         while(i<=10)
         {
            m = n * i;
            System.out.printf("%d * %d = %d%n",n,i,m);
            i++;
         } 
      }
      
      // Method using the do while loop.
      void mTable_do_while(int n)
      {
         int i=1, m;
         do
         {
            m = n * i;
            System.out.printf("%d * %d = %d%n",n,i,m);
            i++;
         }while(i<=10);
      }
      
      // Method using the for loop.
      void mTable_for (int n)
      {
         int i,m;
         for (i=1;i<=10;i++)
         {
            m = n*i;
            System.out.printf("%d * %d = %d%n",n,i,m);
         }
      }
}

// Main class.
class MultiplicationTable
{
   public static void main(String args[])
   {
      // Declaring an object to get an input for Scanner Class.
      Scanner console = new Scanner(System.in);
      // Declaring an object for the Multiplication class.
      Multiplication Table = new Multiplication();      
      String c, cont;
      // Using do while loop to ask the input of the numbers and methods user wants to use and then if they want to continue using other methods or not.
      do
      {
         System.out.print("\nEnter the number whose multiplication table you want to print: ");
         int num_input = console.nextInt();
         System.out.print("Enter which method you want to call:\n 1.mTable_while   2.mTable_do_while   3.mTable_for: ");
         int user_input = console.nextInt();
               if (user_input>0 && user_input<4)
               {   
                        if (user_input==1)
                        {
                           System.out.println();
                           Table.mTable_while(num_input);
                        }
                        else if (user_input==2)
                        {
                           System.out.println();
                           Table.mTable_do_while(num_input);
                        }
                        else
                        {
                           System.out.println();
                           Table.mTable_for(num_input);
                        }
                  }
               else
               {
                  System.out.print("\nInvalid Entry! Please choose 1,2,3 for your input. ");
               }
      System.out.print("Do you want to continue (y/n): ");
      cont = console.next();
      c = cont.toUpperCase();
      }while(!c.equals("N"));
      System.out.println("\nThank you for using our program.");
      
   }
}