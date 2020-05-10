public class Car extends Vehicle{
    private int numberOfSeats;

    public Car(String name, int year, int numberOfSeats) {
        super("",2020,"do przodu");
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    @Override
    public String toString(){
        return "pojazd" + getName()+ ", jedzie w stronę"+ getGo();
    }
}
