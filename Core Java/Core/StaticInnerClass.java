// Non-Static Anonymous Inner Class


class MumbaiIndians{
   void auction(){
      System.out.println("The player are auctioned and ready for the game");
      // for the local ineer class, you have to create the object inside the method only because it is not accessed outside.
   }
   
   static class captain{
      
      // Instance Method
      void team(){
         System.out.println("The captain has choosen its playing 11");
      }
      
      //Static Method
      static void schedule(){
         System.out.println("The schedule for the IPL is announced.");
      }
   }

   
}


public class StaticInnerClass{
      public static void main(String args[])
      {
         MumbaiIndians MI = new MumbaiIndians();
         MI.auction();  
         // Creating the object for static class
         MumbaiIndians.captain cap  = new MumbaiIndians.captain(); 
         // Calling out the instance method from the static class.
         cap.team();   
         // Calling out the static method from the static class.
         MumbaiIndians.captain.schedule(); // Best practice as static doesnot depend on the object
      }
}