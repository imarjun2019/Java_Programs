//import java.util.Scanner;
//import java.util.Arrays;
import java.util.*;

class ArrayExamples
{
   Scanner console = new Scanner(System.in);
   
   
///////////////////////////////////////////////////// To reverse ang sort an array //////////////////////////////////////////////////////////////////////////////
   void Reverse_and_Sort()
   {
      int a[] = new int[5];
      for (int i=0; i<5; i++)
      {
         System.out.printf("Enter the %d index of array: ",i);
         a[i] = console.nextInt();
      }
      System.out.print("A = ");
      for (int i : a) 
         System.out.print (i + " "); 
      
      int b[] = new int[5];
      int k = 4;
      //Reversing an array, i.e a[]
      for ( int i = 0; i<5; i++ )
      {  
            b[i]=a[k];
            k--;  
      }
        System.out.print("\nReverse A = "); 
        // Printing the reversed array, i.e b[]  
        for (int i : b) 
         System.out.print (i + " "); 
         
      // Sorting an Array in ascending order
      Arrays.sort(b);
      System.out.println("\nSorted numeric array : "+Arrays.toString(b)); 
      
   }
   
//////////////////////////////////////////// Finding the maximum value using a for loop ////////////////////////////////////////////////////////////////////////////////////////   
   void MaxValue_ForLoop (int a[])
   {
   
   System.out.println("\nYour passed Array is : "+Arrays.toString(a)); 
   int alen = a.length;
   int max=a[0];
   for (int i=1; i<alen; i++)
   {
      if (max > a[i])
      {
         max = max;
      }
      else
      {
         max = a[i];
      }
   }
   System.out.println("Max = "+ max);
   }
   
   
////////////////////////////////////////////////////// Finding the product of top two highest values /////////////////////////////////////////////////////////////////////
   void MaxProduct(int []a)
   {
   System.out.println("Your passed array is: " + Arrays.toString(a) );   
   Arrays.sort(a);
   int alen = a.length;
   int MaxProduct = a[alen-1] * a[alen-2]; 
   System.out.println("Maximun possible product = "+MaxProduct+", i.e "+a[alen-1] + " * "+a[alen-2]);
   
   }   
   
   
   void Descending_Order()
   {
      System.out.print("How many integer values you want to enter: ");
      int num = console.nextInt();
      // Note that we have Integer here instead of int[] as Collections.reverseOrder doesn't work for primitive types.
      Integer a[] = new Integer[num];
      for (int i=0; i<num; i++)
      {
         System.out.print("Enter "+(i+1)+" element: ");
         a[i] = console.nextInt();
      }
      
      Arrays.sort(a,Collections.reverseOrder());
      System.out.printf("Array in descending order : %s", Arrays.toString(a)); 
   }
}


class Array_Examples
{
   public static void main (String args[])
   {
      Scanner console = new Scanner(System.in);
      ArrayExamples exec = new ArrayExamples();
      
      
      System.out.println("\n----------------- This is the array Example to reverse an array and sort an array ------------------------------------");
      exec.Reverse_and_Sort();
      System.out.println("\n------------------This is an array Example to find out the maximum value in an array using for loop -----------------------");  
      System.out.print("How many elements you want to input in an array: ");
      int num = console.nextInt();
      int x[] = new int[num];
      for (int i=0; i<num; i++)
      {
         System.out.printf("Enter the %d index of array: ",i);
         x[i] = console.nextInt();
      }   
      exec.MaxValue_ForLoop(x);
      System.out.println("\n--------------- This is an array Example to find out the maximum product possible with two array values --------------------");
      exec.MaxProduct(x);
      
     
      System.out.println("\n-----------------------This is an array Example to sort the array in descending order ---------------------------------------");
      exec.Descending_Order();

      
   }
}
   