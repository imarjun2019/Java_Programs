class ConstructorExample
{
   int studentID;
   String StudentName, Address;
   
   // This is the default constructor.
   ConstructorExample()
   {
   
   }
   
   // This is a parameterized constructor.
   ConstructorExample(int studentID, String Name )
   {   
      this.studentID = studentID;
      StudentName = Name;
      System.out.printf("Student ID = %d and Student Name = %s\n",studentID,StudentName,Address);
      
   }
   // Constructor Overloading
   ConstructorExample(String address)
   {
      Address = address;
      System.out.printf("Address = %s",Address);
   
   }
   
}

class Constructor_Example
{
   // You can change the place of public and static. And you can also change the variable name for args. It doesnot have any effect on the program. 
   static public void main (String[] x)
   {
      ConstructorExample exec = new ConstructorExample(1,"Arjun");
      ConstructorExample exec1 = new ConstructorExample("Atlanta");  
   }

}