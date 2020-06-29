// Methods using their various properties

class Cricket
{
   // Method without return type and without parameter.
   void CricketLeague()
   {
      System.out.println(" 1.IPL \n 2.Bigbash \n 3.BPL \n 4.CPL");  
   }
   
   // Method with return type and with parameter;
   String ChooseLeague (String choice)
   {
      String a = choice;
      return a;     
   }
   
   //Method without return type and with parameter.
   void LeagueTeams (String Teams)
   {
      String team = Teams;
      System.out.println ("\nPlayer choose to play from : " + team);
   }
   
   //Method with return type and without parameters.
   int JerseyNumber()
   {
      int jersey_number = 10;
      return jersey_number;
   }
}

// Defining the main class.
class Players{
	public static void main (String args[])
	{
		Cricket leagues = new Cricket();
      System.out.println("Please Choose your league");
		leagues.CricketLeague();
      
      System.out.println ("Player choose to play in : " + leagues.ChooseLeague("IPL"));
     
      System.out.println (" \nPlease choose your team \n1.Mumbai Indians 2.Chennai Super Kings 3.Royal Challengers Banglore 4.Rajasthan Royals 5.Delhi Daredevils 6.Kings XI Punjab 7.Sunrise Hydrabad 8.Kolkatta Knight Riders");
      leagues.LeagueTeams ("Mumbai Indians");
      
      System.out.println ("\nPlayer choose his jersey number to be " + leagues.JerseyNumber());
	}
}

