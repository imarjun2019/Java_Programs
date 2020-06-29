abstract class Sports
{
   
   abstract void Type();
   
   abstract void playedIn ();
   
   abstract void numberOfPlayers();
   
   void sportsInfo(){
      System.out.println("Playing sports makes you active and fit.\n");
   }
}

class Cricket extends Sports
{
   void Type(){
      System.out.println("Cricket is a \"Outdoor Game\"");
   }
   
   void playedIn(){
      System.out.println("Cricket is palyed in \"Pitch\".");
      
   }
   
   void numberOfPlayers(){
      System.out.println("There are \'11\' players in a team.");
   }
}

class PingPong extends Sports
{
   void Type(){
      System.out.println("Ping Pong is a \"Indoor Game\"");
   }
   
   void playedIn(){
      System.out.println("Ping Pong is palyed in \"PingPong Table\".");
      
   }
   
   void numberOfPlayers(){
      System.out.println("There are \'1 or 2\' players in a team.");
   }
}

class AbstractDemo
{
   public static void main(String args[])
   {
      Cricket exec = new Cricket();
      exec.sportsInfo();
      exec.Type();
      exec.playedIn();
      exec.numberOfPlayers();
      System.out.println("\n");
      PingPong exe = new PingPong();
      exe.sportsInfo();
      exe.Type();
      exe.playedIn();
      exe.numberOfPlayers();
   }
}

