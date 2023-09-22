public class CarApplication {

    private String Model;

    private String Year;

    private double Price;

    private int gear;
    private boolean isOn;

    private int acceleration;
    public int deceleration;

    public CarApplication(String model, String year, double price) {
        this.Model = model;
        this.Year = year;
        this.Price = price;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getGear() {
        return gear;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration + 1;

    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setDeceleration(int deceleration) {
        this.deceleration = deceleration - 1;
    }

    public int getDeceleration() {
        return deceleration;
    }
}