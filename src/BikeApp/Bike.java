import static sun.security.ssl.SSLLogger.isOn;

public class Bike {
    private boolean isOn;
    private int acceleration;
    private int gear;
    private int deceleration;

    public boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void increaseAcceleration() {
        if (gear == 1) acceleration++;
        if (gear == 2) acceleration += 2;
        if (gear == 3) acceleration += 3;
        if (gear == 4) acceleration += 4;


    }

    public void setDeceleration(int deceleration) {
        this.deceleration = deceleration;
    }

    public int getDeceleration() {
        return deceleration;

    }

    public void decreaseDeceleration() {
        if (gear == 1) deceleration --;
        if (gear == 2) deceleration -= 2;
        if (gear == 3) deceleration -=3;
        if (gear == 4) deceleration -=4;
    }
}


