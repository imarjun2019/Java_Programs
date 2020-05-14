import java.util.*;

public class WrapperClass
{
   public static void main (String args[])
   {
      IntegerWrapper.IntWrapper();
      System.out.println("==========================================================================\n");
      StringrWrapper strWrap = new StringrWrapper();
      strWrap.StrWrapper();
      System.out.println("===========================================================================\n");
      ArrayWrapper.ArrayWrapper();
      
   }
}

class IntegerWrapper
{
   public static void IntWrapper()
   {
      Integer a = new Integer(10);
      System.out.println("Integer a = " + a);
      
      Integer b = 20; //autoboxing
      System.out.println("Integer b = " + b);
      
      int c = a; //auto-unboxing
      System.out.println("Integer c = " + c);
      
      // Changes the integer value to a string value. Now, c+d gives the incompatible types error.
      String d = Integer.toString(a);
      System.out.println("String d = " + d);
      
      // Changes or parses the value of Strinf d to int. parseInt is only possile if it is a integer string.
      int e = Integer.parseInt(d);
      System.out.println("Integer e = " + e);

      int f = c + e;
      System.out.println("Integer f = " + f);
      
      // If both the integers are equal it will return 0 and if they are not equal it will return -1.
      int g = Integer.compare(a,f);
      System.out.println("Integer g = " + g);
     
     // Provides the integer value. It is not a static method, so it depends upon the object.
      int h = a.intValue();
      System.out.println("Integer h = " + h);
      
      //Gives the maximum value that a integer can have.
      int i = Integer.MAX_VALUE;
      // Gives the minimum value that a integer can have.
      int j = Integer.MIN_VALUE;
      System.out.println("Integer i = " + i + " and j = " + j);
      
      String k = Integer.toBinaryString(a);
      System.out.println("String k = " + k);
      
      String z ="33";
      // Parses the string argument as a signed integer in the radix specified by the second argument.
      int l = Integer.parseInt(z,b);
      System.out.println("Integer l = " + l);
   }
}

class StringrWrapper
{
   public void StrWrapper()
   {
      String i = new String ("Hello");
      System.out.println("String i = " + i);
      
      String j = "World"; //autoboxing
      System.out.println("Stringr j = " + j);
      
      String k = i; //auto-unboxing
      System.out.println("String k = " + k);
      
      //Gives the length of the string
      int a = k.length();
      System.out.println("Integer a = " + a);
      // Checks if the given strings are equal or not and provides the boolean value.
      boolean b = i.equals(j);
      System.out.println("Boolean b = " + b);
      // Provides the index of the string position.
      int c = i.indexOf("l");
      System.out.println("Value of c is " + c);
      // Java String hashCode() method returns the hash code for the String. Hash code value is used in hashing based collections like HashMap , HashTable etc. 
      //This method must be overridden in every class which overrides equals() method.
      int d = i.hashCode();
      System.out.println("Value of d is " + d);
      //Tells whether or not this string matches the given regular expression.
      boolean e = i.matches("Hello");
      System.out.println("Value of e is " + e);
      //Returns the char value at the specified index.
      char f = i.charAt(0);
      System.out.println("Value of f is " + f);
      //changes the character in the string to lowercase and uppercase
      String g = i.toLowerCase();
      String h = i.toUpperCase();
      System.out.println("Value of g is " + g + " and the value of h is " + h);
      // Tests if this string ends with the specified suffix.
      boolean m = g.endsWith("o");
      System.out.println("Value of m is " + m);
      
   }
}
class ArrayWrapper
{
   public static void ArrayWrapper()
   {
      String a[] = {"Atlanta", "Chicago", "New York", "Las Vegas", "Baltimore"};
      int b[] = {1,2,3,4,5,6,9,8,7};
      int d[] = {9,2,3,4,76,89,55,4};
      // Checks if the two arrays are equal.
      boolean o = Arrays.equals(b,d);
      System.out.println("is Array b and d equal? " + o);
      // Checks if the sub index of two arrays are equal or not.
      boolean p = Arrays.equals(b,1,5,d,1,5);
      System.out.println("is Array b and d equal with integers? " + p);
      
      System.out.println("The value of b is " + Arrays.toString(b));
      //Sorts the array in ascending order
      Arrays.sort(b);
      System.out.println("Sorted value of b in ascending order is " + Arrays.toString(b));
      //Same like arrays.sort() but very applicable when processing for larger data.
      Arrays.parallelSort(b);
      System.out.println("Parallel Sorted value of b in ascending order is " + Arrays.toString(b));

      
      // To use collections you have to use the wrapper class.
      Integer c[] = {1,2,3,4,5,6,9,8,7};  //auto_boxing
      System.out.println("The value of c is " + Arrays.toString(c));
      Arrays.sort(c,Collections.reverseOrder());
      System.out.println("Sorted value of c in descending order is " + Arrays.toString(c));
      
      Arrays.sort(d);
      System.out.println("Sorted value of d in ascending order is " + Arrays.toString(d));
      // It procides the index position of that integer in the array.
      int m = Arrays.binarySearch(d,55);
      System.out.println("The value of m is " + m);
      
      
      String n = Arrays.toString(a);
      System.out.println("The value of n is " + n); 
      
   }
}