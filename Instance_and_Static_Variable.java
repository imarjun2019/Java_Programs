// This is a sample program using an instance and static variable.

// Declaring a class
class Cricket{
	String player_name;
	int player_number;
	String player_team;
	static String player_league;
} 
// Declaring a class
class Hospital{
   static String H_name;
   static String H_address;
   String Patient_name;
   int Patient_ID;
   int Patient_age;
   String Patient_Diagnosis;	
}

// Declaring a main class that utilizes the Cricket Class.
class PlayerInformation {
	public static void main (String args[])
	{
		// Creating a new object for Cricket class.
		Cricket playerInfo = new Cricket();
		// Initializing the variable.
		playerInfo.player_name = "Sachin Tendulkar";
		playerInfo.player_number = 10;
		playerInfo.player_team = "Mumbai Indians";
		Cricket.player_league = "IPL";
		//Printing out the information.
		System.out.println("Player name is " + playerInfo.player_name);
		System.out.println("Player number is " + playerInfo.player_number);
		System.out.println("Player plays from " + playerInfo.player_team);
		System.out. println("Player plays in " + Cricket.player_league);
		//Creating another new object for a Cricket class.
		Cricket playerInfo1 = new Cricket();
		//Initializing a variables.
		playerInfo1.player_name = "AB de Villiers";
		playerInfo1.player_number = 17;
		playerInfo1.player_team = "Royal Challengers Banglore";
		//Printing out the information.
		System.out.println("\nPlayer name is " + playerInfo1.player_name);
		System.out.println("Player number is " + playerInfo1.player_number);
		System.out.println("Player plays from " + playerInfo1.player_team);
		System.out. println("Player plays in " + Cricket.player_league);
		
		// Creating a new object for Hospital Class.
		Hospital patientInfo = new Hospital();
		Hospital.H_name = "Wellstar";
		Hospital.H_address = "Atlanta, GA";
		patientInfo.Patient_name = "Arjun Sharma";
		patientInfo.Patient_age = 22;
		patientInfo.Patient_Diagnosis = "Shoulder Injury";
		patientInfo.Patient_ID = 226;
		
		System.out.println("\nPatient " + patientInfo.Patient_name + " with patient id of " + patientInfo.Patient_ID+ " and of age " + patientInfo.Patient_age + " is diagonised with " + patientInfo.Patient_Diagnosis + " and is admitted in Hospital,"+ Hospital.H_name + " located in "+Hospital.H_address + ".");
		// Creating another new object for Hospital class.
		Hospital patientInfo1 = new Hospital();
		patientInfo1.Patient_name = "Hanic Sharma";
		patientInfo1.Patient_age = 23;
		patientInfo1.Patient_Diagnosis = "Ankle Injury";
		patientInfo1.Patient_ID = 227;
		
		System.out.println("\nPatient " + patientInfo1.Patient_name + " with patient id of " + patientInfo1.Patient_ID+ " and of age " + patientInfo1.Patient_age + " is diagonised with " + patientInfo1.Patient_Diagnosis + " and is admitted in Hospital,"+ Hospital.H_name + " located in "+Hospital.H_address + ".");
	}
}

// You can also create a separae new class to run the variables in Hospital Class. 
class PatientInformation {
		public static void main(String args[]){
			// Creating a new object for Hospital class.
			Hospital patientInfo = new Hospital();
			// Initializing the values for Hospital class.
			Hospital.H_name = "Wellstar";
			Hospital.H_address = "Atlanta, GA";
			patientInfo.Patient_name = "Arjun Sharma";
			patientInfo.Patient_age = 22;
			patientInfo.Patient_Diagnosis = "Shoulder Injury";
			patientInfo.Patient_ID = 226;
			// Print out the patient information.
			System.out.println("Patient " + patientInfo.Patient_name + " with patient id of " + patientInfo.Patient_ID+ " and of age " + patientInfo.Patient_age + " is diagonised with " + patientInfo.Patient_Diagnosis + " and is admitted in Hospital,"+ Hospital.H_name + " located in "+Hospital.H_address + ".");
			// Creating aother object for a Hospitl class.
			Hospital patientInfo1 = new Hospital();
			// Initializing the values for object class.
			patientInfo1.Patient_name = "Hanic Sharma";
			patientInfo1.Patient_age = 23;
			patientInfo1.Patient_Diagnosis = "Ankle Injury";
			patientInfo1.Patient_ID = 227;
			// Displaying out the patient information.
			System.out.println("\nPatient " + patientInfo1.Patient_name + " with patient id of " + patientInfo1.Patient_ID+ " and of age " + patientInfo1.Patient_age + " is diagonised with " + patientInfo1.Patient_Diagnosis + " and is admitted in Hospital,"+ Hospital.H_name + " located in "+Hospital.H_address + ".");
		}
}
		