// Conditional Statements and Operators in Java
import java.util.Scanner;

// Declaring a class
class Grade
{
   // Method without return and parameter.
	void GradeSystem()
	{
			System.out.println ("90 and above = A\n80-90 = B\n70-80 = C\n60-70 = D\n60 and Below = Fail");
	}
   
   // Method with return and parameters.
   double GradeCalc (double total_score, int total_subject)
   {  
      double totalScore = total_score;
      int totalSubject = total_subject;
      
      double grade = totalScore/totalSubject;
      return grade;
   }
}

// Defining the main class.
class StudentsPercentage
{
		public static void main (String args[])
		{
         // Defining the object to get an input. 
         Scanner input = new Scanner (System.in);
         // Defining the object for grade class.
			Grade Students = new Grade();
         // Calling the GradeSystem method.
         Students.GradeSystem();
         System.out.print("Enter total number of subjects: ");
         // Getting the input of total subjects from the user.
         int subjects = input.nextInt();
         System.out.print("Enter your total score: ");
         // Getting the input of the total score from the user.
         double score = input.nextDouble();
         // Calling out the GradeCalc method and initializing it to avg_grade.
         double avg_grade = Students.GradeCalc(score,subjects);
         System.out.println ("The student average score is: "+avg_grade);
         // Using conitional if-else statements to get the GPA letter.
         if (avg_grade >=90)
            System.out.println("Excellent, you passed with an A");
         else if (avg_grade>=80 & avg_grade<90)
            System.out.println("Very good, you passed with a B");
         else if (avg_grade>=70 & avg_grade<80)
            System.out.println("Good, you passed with a C");
          else if (avg_grade>=60 & avg_grade<70)
            System.out.println("Work hard, you passed with a D");
         else
            System.out.println("Sorry, you failed. Try again!!");
		}
}
