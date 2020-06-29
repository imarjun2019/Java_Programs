import java.util.*;
public class InheritanceExamples
{
   public static void main (String[] args)
   {
      Scanner console = new Scanner (System.in);
      
      
      System.out.println("\n---------------------This is the example of single level inheritance-------------------------------- \n");
      InheritanceChild exec = new InheritanceChild();
      System.out.print("Enter the number to check whether it is prime or not: ");
      int num = console.nextInt();
      System.out.println(exec.isPrime(num));
      
      System.out.println("\n\n-------------------This is the example of multi level inheritance....................................");
      Teams obj = new Teams();
      obj.LeagueTeams();
      
      
      
      System.out.println("\n\n...................This is the example of hierarchical level inheritance...............................");
      AreaOfCircle cir_area = new AreaOfCircle();
      cir_area.areaOfCircle();
      AreaOfSquare sq_area = new AreaOfSquare();
      sq_area.areaOfSquare();
      
      
   }
}


/////////////////////////////////////////////////////////// Single Level Inheritance //////////////////////////////////////////////////////////////////////////////////////////////////
// This is the parent class.
class Inheritance
{
   public static boolean isOdd (int num)
   {
      if (num%2==0)
         return false;  
      else
         return true;         
   }
}

class InheritanceChild extends Inheritance
{
   public static String isPrime (int num)
   {       
      int count = 0;  
      if ((num>=0 && num<=2) || (num ==-1 || num ==-2) )
      {
         return "The number " + num +" is neither prime nor composite"; 
      }
      else if (isOdd(num))
      {
         for (int i=1; i<=num/2; i++)
         {
            if ((num%i)==0)
               count++;     
         }
         // Its not less or equal to in this case because the division by number itself is already eleminated by dividing num/2. So, it wont count number divided by itself which would have given zero. 
         if (count < 2 )
         return num + " is Prime";
      else
         return num + " is Composite";
      }
      else  if (!isOdd(num))
         return "Even number greater than 2 or smaller than -2 is always composite";
      else
         return "Unexpected number or integer";
   }
}





//////////////////////////////////////////////////////////// //////////Multi Level Inheritance/////////////////// //////////////////////////////////////////////////////////////////

class Country
{
   
   static Scanner console = new Scanner(System.in);
   public static String showCountries()
   {
      String[] Countries = {"INDIA", "BANGLADESH", "PAKISTAN"};
      System.out.println("Available Countries");
      System.out.println (Arrays.toString(Countries));
      
      System.out.print("\nEnter the country name to see the leagues and popular teams: ");
      String input = console.next();
      String user_input = input.toUpperCase();
       
      boolean check = true;
      
      for (int i=0; i<=Countries.length-1; i++)
      {
         if ( Countries[i].equals(user_input) )
         {
            check = true;
            break;
         }
         else
         {
            check = false;   
         } 
      }
      
      if (check==true)
      {
         System.out.print("Your choosen country is ");
         return user_input;
      }
      else
         return "Please enter the countries from the list.";
   } 
}

class Leagues extends Country
{
  
   public static String Leagues()
   {
   
   String Country = showCountries();
   System.out.print (Country);
   
   String Indian_League = "IPL";
   String Bangladesh_League = "BPL";
   String Pakistan_League = "PSL";
   
   String League;
   
   if(Country.equals("INDIA"))
   {
      League = "IPL";
   }
   else if(Country.equals("BANGLADESH"))
   {
      League = "BPL";
   }
   else if(Country.equals("PAKISTAN"))
   {
      League = "PSL";
   }
   else
      League = "None";
      
   if (League=="IPL" || League=="BPL" || League=="PSL")
   {
      System.out.print ("\nThe most popular league is: "+League);
      return League;
   }
   else 
   {
      return "No Information Found";
   }
}

}

class Teams extends Leagues
{
   public static void LeagueTeams()
   {
   
   String[] IPL_Teams = {"Mumbai Indians", "Chennai Super Kings", "Royal Challengers Banglore"};
   String[] BPL_Teams = {"Rangpur Rangers", "Dhaka Platoon", "Cumilla Warriors"};
   String[] PSL_Teams = {"Karachi Kings", "Lahore Qalandars", "Peshawar Zalmi"};
   
   String league = Leagues();
   
   if (league.equals("IPL"))
      {
         System.out.printf ("\nMost popular teams are:  %s",Arrays.toString(IPL_Teams));
      }
   else if (league.equals("BPL"))
      {
         System.out.printf ("\nMost popular teams are:  %s",Arrays.toString(BPL_Teams));
      }
   else if (league.equals("PSL"))
      {
          System.out.printf ("\nMost popular teams are:  %s",Arrays.toString(IPL_Teams));
      }
   else
         System.out.print (" Try Again!!");
   }
}


//////////////////////////////////////////////////////// Hierarchical Level Inheritance /////////////////////////////////////////////////////////////////////////////////////////////////


class MathFormulas
{
   static Scanner console = new Scanner(System.in);
   
   private static final double pi = 3.14;
   
   public static double areaOfCircle ( double radius)
   {
      double area = pi * Math.pow(radius,2);
      return area;
   }
   
   public static double areaOfSquare (double side)
   {
      double area = Math.pow(side,2);
      return area;
   }
   
}

class AreaOfCircle extends MathFormulas
{
   public static void areaOfCircle ()
   {
      System.out.print("Enter the radius of circle: ");
      double radius = console.nextDouble();
      
      double area = areaOfCircle(radius);
      
      System.out.println ("Area = " + area);
   }
   
}

class AreaOfSquare extends MathFormulas
{
   public static void areaOfSquare()
   {
      System.out.print("Enter the length of the side of square: ");
      double side = console.nextDouble();
      double area = areaOfSquare(side);
      System.out.println ("Area = " + area);
   }
}

      
      
      
      





