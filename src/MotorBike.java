public class MotorBike extends Vehicle{
    private int speedLimit;

    public MotorBike(String name, int year, int speedLimit) {
        super("Honda Goldwing",2018,"do przodu");
        this.speedLimit = speedLimit;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }
}
