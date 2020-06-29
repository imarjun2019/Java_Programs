public class vehicle {
    String name;
    String size;
    int currentVelocity, currentDirection;

    vehicle (String name, String size){
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer (int direction)
    {
        this.currentDirection = direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees");
    }

    public void move (int velocity, int direction){
        this.currentDirection = direction;
        this.currentVelocity = velocity;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + "Steering at " + currentDirection + " degrees");
    }

    public void stop(){
        this.currentVelocity = 0;
    }


    public String getName(){
        return name;
    }

    public String getSize(){
        return size;
    }

    public int getCurrentVelocity(){
        return currentVelocity;
    }

    public int getCurrentDirection(){
        return currentDirection;

    }

}
