public class car extends vehicle {
    int wheels;
    int doors;
    int gears;
    boolean isManual;
    int currentGear;

    car (String name, String size, int wheels, int doors, int gears, boolean isManual){
        super(name,size);
        this.wheels = wheels;
        this.size = size;
        this.doors = doors;
        this.gears=gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    // Method for current gear
    public void changeCurrentGear (int currentGear){
        this.currentGear = currentGear;
        System.out.println("car.setCurrentGear(): changed to " + this.currentGear + " gear");
    }

    public void changeVelocity (int speed, int direction){
        move(speed,direction);
        System.out.println("car.changeVelocity(): Velocity " + speed + " direction " + direction);
    }


}
