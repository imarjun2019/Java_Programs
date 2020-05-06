import java.util.*;

public class MethodOverRidingExample {
    public static void main(String args[]){
            Scanner console = new Scanner (System.in);
            // Providing the default values for radius and height.
            double radius=1, height=1;
            System.out.print ("Enter the radius of a cylinder: ");
            boolean check = console.hasNextInt();
            if (check)
                radius = console.nextInt();
            else
                System.out.println("Invalid Entry. Will go with default value");

            System.out.print ("Enter the height of a cylinder: ");
            check = console.hasNextInt();
            if (check)
                height = console.nextInt();
            else
                System.out.println("Invalid Entry. Will go with default value");

            // Passing the parameters into constructors from the user entry.
            AreaOfCylinder exec = new AreaOfCylinder(radius,height);
            System.out.println(exec.calc());
            // Passing the parameters into a constructor with hard core values.
            exec = new perimeterOfCylinder(radius,height);
            System.out.println(exec.calc());
            // Passing out the parameters in the form of hard code values and user entered value.
			System.out.println("----------------- The values from now onwards are user entered, hardcoaded, and default------------------------------");
            exec = new circumferenceOfCylinder(2,height);
            System.out.println(exec.calc());
            // This constructor will use the default values of height and then the radius passed.
            exec = new AreaOfCylinder(radius);
            System.out.println(exec.calc());
            // This constructor will use the default radius and height values set in the constructor itself.
            exec = new circumferenceOfCylinder();
            System.out.println(exec.calc());
    }
}


class AreaOfCylinder {
    final double pi = 3.14;
    double radius;
    double height;

    // Creating a default constructor with default value if user do not pass any parameter for circle.
    public AreaOfCylinder()
    {
        // Setting the default value if the user do not pass any value.
        this(1,1);
    }

    // Creating a constructor with one parameter for area of circle and circumference of circle.
    public AreaOfCylinder(double radius)
    {
        //Setting the default height value if the user enters only radius value.
        this(radius,1);
    }

    // Creating a constructor with two parameters for area of cylinder and circumference of cylinder.
    public AreaOfCylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    String calc (){
        // can access variable with and without this keyword.
        double area = (2*this.pi*this.radius*this.height) + (2*pi*(Math.pow(radius,2)));
        return "Area of cylinder with radius " + radius + " and height " + height + " = " + area;
    }
}

class perimeterOfCylinder extends AreaOfCylinder{
    public perimeterOfCylinder(double radius)
    {
        //Setting the default height value if the user enters only radius value.
        this(radius,1);
    }

    // Creating a constructor with two parameters for area of cylinder and circumference of cylinder.
    public perimeterOfCylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    // This is the default constructor.
    public perimeterOfCylinder() {
        this (1,1);

    }
    //Method Overriding
    String calc (){
        // can access variable with and without this keyword.
        double diameter = 2 * radius;
        double perimeter = 2 * (pi * (radius*2));
        return "Perimeter of cylinder with radius " + radius + " and height " + height + " = " + perimeter;
    }
}

class circumferenceOfCylinder extends perimeterOfCylinder{
    public circumferenceOfCylinder(double radius)
    {
        //Setting the default height value if the user enters only radius value.
        this(radius,1);
    }

    // Creating a constructor with two parameters for circumference of cylinder.
    public circumferenceOfCylinder(double radius, double height){

        this.radius = radius;
        this.height = height;
    }
    public circumferenceOfCylinder(){
        this(1,1);
    }

    // Method Overriding
    String calc (){
        double circumference = 2 * pi * radius;
        return "Circumference of cylinder with radius " + radius + " and height " + height + " = " + circumference;
    }

}

