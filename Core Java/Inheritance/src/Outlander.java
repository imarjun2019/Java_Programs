public class Outlander extends car{
    int roadServiceMonths;
    // Constructor
    Outlander (int wheels, int doors, int gears, boolean isManual, int roadServiceMonths){
        super ("Outlander","4WD",wheels,doors,gears,isManual);
        this.roadServiceMonths = roadServiceMonths;
    }
    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;

        if (newVelocity == 0){
            stop();
            changeCurrentGear(1);
        }
        else if (newVelocity > 0 && newVelocity <= 10){
            changeCurrentGear(1);
        }
        else if (newVelocity > 10 && newVelocity <=20){
            changeCurrentGear(2);
        }
        else if (newVelocity > 20 && newVelocity <=30){
            changeCurrentGear(4);
        }
        else
            changeCurrentGear(4);

        if (newVelocity > 0){
            changeVelocity (newVelocity, getCurrentDirection());
        }

    }
}

