// Non-Static Member Inner Class

class MumbaiIndians{
   void auction(){
      System.out.println("The player are auctioned and ready for the game");
   }
   class captain{
      void team(){
         System.out.println("The captain has choosen its playing 11");
      }
   }
}


public class MemberInnerClass{
      public static void main(String args[])
      {
         MumbaiIndians MI = new MumbaiIndians();
         MI.auction();
         
         // Creating an object for the inner class captain
         MumbaiIndians.captain cap = MI.new captain();
         cap.team();
      
      }
}

/*

// Another way. Create the object for the class inside the method of your outer class.

class MumbaiIndians{
   void auction(){
      System.out.println("The player are auctioned and ready for the game");
      
      // Creating an object for the inner class captain.
      captain cap = new captain();
      cap.team();
   }
   
   class captain{
      void team(){
         System.out.println("The captain has choosen its playing 11");
      }
   }
   
}


public class MemberInnerClass{
      public static void main(String args[])
      {
         MumbaiIndians MI = new MumbaiIndians();
         MI.auction();
      }
}

*/