class NestedForLoop
{
   void RightAngleTriangle_Pattern()
   {
      System.out.println("--------------- Pattern 1 to form Right Angle Triangle -----------------------");
      int a;
      for (int i=1; i<=5; i++)
      {
         a = i;
         for (int j=5; j>=i; j--)
         {
            
            System.out.print(a+" ");
            a++;
                        
         }
         System.out.println();
      }

   
      System.out.println("--------------- Pattern 2 to form Right Angle Triangle -----------------------");
      int k;
      for (int i=5; i>=1; i--)
      {
         k = i;
         for (int j=5; j>=i; j--)
         {
            
            System.out.print(k+" ");
            k++;
                        
         }
         System.out.println();
      }
      
      System.out.println("----------------------- Pattern 3 to form a Right Angle Triangle ----------------------------------");
      
      int e,f,g;
      for (e = 1; e <= 7; e++)
      {
         for (f = 1; f <= e; f++)
         {
            System.out.print(f);
         }
      
         for (g = 7 - e; g >= 1; g--)
         {
           System.out.print("*");
         }
      
        System.out.println("");
      }
   }
   
   void Triangle_Pattern()
   {
      System.out.println("--------------- Pattern 1 to form a Triangle  -----------------------");
      for (int i=1; i<=5; i++)
      {
         for (int k=5; k>=i; k--)
         {
         System.out.print(" ");
         }
         for (int j=1; j<=i; j++)
         {
            System.out.print(j + " ");
         }
         System.out.println();
      }
      
      System.out.println("\n------------------------ Pattern 2 to form a Triangle -----------------------");
      
      for (int i=5; i>=1; i--)
      {
         for (int k=5; k>=i; k--)
         {
         System.out.print("*");
         }
         for (int j=1; j<=i; j++)
         {
            System.out.print(j + " ");
         }
         System.out.println();
      }
   }
   
   
   void Two_Dimentional_Multliplication_Table()
   {
   System.out.println("This is the Multiplication Table from 1-10:\n");
   for (int i=1; i<=10; i++)
   {
      System.out.print("\t"+i);
   }
   
      System.out.println("\n");
      for (int k=1; k<=10; k++)
      {
      System.out.print(k);
      for (int j=1; j<=10 ; j++)
      {
      System.out.print("\t"+(k*j));
      }
      System.out.println();
      }
   }

}

// Main Method
class Loop
{
   public static void main (String args[])
   {
      NestedForLoop exec = new NestedForLoop();
      exec.RightAngleTriangle_Pattern();
      System.out.println();
      exec.Triangle_Pattern();
      System.out.println();
      exec.Two_Dimentional_Multliplication_Table();
      
   }
}