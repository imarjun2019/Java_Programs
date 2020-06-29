import java.util.*;
import java.text.*;

public class DateTest
{
   public static void main(String args[]) throws Exception
   {
      String d = "1995-06-06";
      String e = "1995-06-07";
      
      SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
      Date date1 = dt.parse(d);
      Date date2 = dt.parse(e);
      
      System.out.println(date1);
      System.out.println(date2);
      
      long diff = date2.getTime()-date1.getTime();
      System.out.println(diff);
      
      int diffd = (int) (diff/ (24*60*60*1000));
      System.out.println(diffd);



      
        
   
   }
}