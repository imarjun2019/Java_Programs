// Non-Static Local Inner Class

class MumbaiIndians{
   void auction(){
      System.out.println("The player are auctioned and ready for the game");
      // for the local inner class, you have to create the object inside the method only, because it is not accessed outside it.
      class captain{
      void team(){
         System.out.println("The captain has choosen its playing 11");
      }
   }
   captain cap = new captain();
   cap.team();
   }
   
}


public class LocalInnerClass{
      public static void main(String args[])
      {
         MumbaiIndians MI = new MumbaiIndians();
         MI.auction();      
      }
}