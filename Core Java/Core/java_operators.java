//Program using various types of operators in JAVA.

class JavaOperators
{
	   void increment_decrement()
      {
         int a,b,c,d,e,f,g,h;
         a=10;
         b=20;
         e=30;
         f=40;
         c = ++a;
         d = b++;
         g = --e;
         h = f--;
         System.out.println("--------------This is the test for increment decrement operators----------------");
         System.out.println ("A="+a+" ,++a i.e C="+c);
         System.out.println ("B="+b+" ,b++ i.e D="+d);
         System.out.println ("E="+e+" ,--e i.e G="+g);
         System.out.println ("F="+f+" ,f--= i.e H="+h);
         System.out.println("---------------------------------------------------------------------------------\n");
      }
      
      void arithmetic_operators()
      {
         int a,b,c,e,f,g,h,i;
         a= 10;
         b=20;
         c=7;
         e = a+b;
         f = b-a;
         g = b*c;
         h = a/c;
         i = a%c;//a MOD C
         
         System.out.println("---------------------This is the test for the arithmetic operators-----------------------------");
         System.out.printf("a+b=%d, b-a=%d, b*c=%d, a/c=%d, a MOD c=%d",e,f,g,h,i); 
         System.out.println("\n------------------------------------------------------------------------------------------------\n");
         
      }
      
      void relational_operators()
      {
         double a,b;
         char g,h;
         boolean c,d,e,f;
         a = 10.5;
         b = 10.8;
         g = 'c';
         h = 'd';
         c = (a>b);
         d = (a<b);
         e = (g>=h);
         f = (g<=h);
         System.out.println("\n-------------------- This is the test for relational operators --------------------------------");
         System.out.printf("(a>b)=%b, (a<b)=%b, (g>=h)=%b, (g<=h)=%b",c,d,e,f);
         System.out.println("-------------------------------------------------------------------------------------------------");
      }
      
      void equality_operators()
      {
         String a,b;
         boolean c,d;
         
         a = "Arjun";
         b = "Hanic";
         
         c = (a==b);
         d = (a!=b);
         
         System.out.println("\n----------------------------- This is the test for Equality Operator ------------------------");
         System.out.printf("(a==b)=%b, (a!=b)==%b",c,d);
         System.out.println("\n---------------------------------------------------------------------------------------------------------");
      
      }
      
      void bitwise_operators()
      {
         int a,b,c,d,e;
         boolean f,g,h;
         a= 100;
         b= 50;
         c=(a&b);
         d=(a|b);
         e=(a^b);
         
         f = ((a>b) & (b>a));
         g = ((a>b) | (b>a));
         h = ((a>b) ^ (b>a));// For XOR TT=F, TF=T, FT=T, FF=F
         
         System.out.println("---------------------- This is the test of bitwise operator -----------------------------");
         System.out.printf("(a&b)=%d, (a|b)=%d, (a^b)=%d",c,d,e);
         System.out.printf("\n((a>b) & (b>a))=%b \n((a>b) | (b>a))=%b\n((a>b) ^ (b>a))=%b",f,g,h);
         System.out.println("\n----------------------------------------------------------------------------------------");
      }
      
      void compound_operators(int a,int b)
      {
         int c,d,e,f,g;
         c = 10;
         d = 200;
         e = 2;
         f = 5;
         g = 10;
         c+=a;// c=c+a;
         d-=b;// d=d-b;
         e*=a;// e=e*a;
         f/=b;// f=f/b;
         g%=b;// g=g%b;
         
         System.out.println("\n------------------ This is the test for a compound operators -------------------------------");
         System.out.printf("(c+=a =%d), (d-=b =%d),(e*=a = %d), (f/=b = %d), (g Mod=b =%d)",c,d,e,f,g);
         System.out.println("\n-------------------------------------------------------------------------------------------");
      
      }
      
}
   
class operations
{
   public static void main (String srags[])
   {
      JavaOperators operator = new JavaOperators();
      operator.increment_decrement();
      operator.arithmetic_operators();
      operator.relational_operators();
      operator.equality_operators();
      operator.bitwise_operators();
      int a = 120;
      int b = 60;
      operator.compound_operators(a,b);
   
   
   }


}




