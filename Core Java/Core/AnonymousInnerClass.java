// Non-Static Anonymous Inner Class. It is the class without any name.
// Since without any name we cannot create an object, we need a constructor for the anonymous inner class.
// Its because constructor takes part in constructor creation.
abstract class MumbaiIndians{
   // Concrete method
   void auction(){
      System.out.println("The player are auctioned and ready for the game");
      // for the local ineer class, you have to create the object inside the method only because it is not accessed outside.
   }
   // Abstract Method.
   abstract void teams();
}

public class AnonymousInnerClass{
      public static void main(String args[])
      {
      
         MumbaiIndians MI = new MumbaiIndians(){
            void teams(){
               System.out.println("Team member announced");
            }
         };
         // Calling the concrete method in the MumbaiIndians class.
         MI.auction();
         // Calling the teams method created inside the anonymous class.
         MI.teams(); 
      }
}