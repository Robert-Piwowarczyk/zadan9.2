public class RentableCar extends Car implements Rentable {

    private Person person;

    public RentableCar(String name, int year, int numberOfSeats) {
        super(name, year, numberOfSeats);
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    @Override
    public void rent(String firstName, String lastName, String id){
        person = new Person(firstName,lastName,id);
    }
    @Override
    public void handOver(){
        person = null;
    }
    @Override
    public  boolean isRent(){
        return person != null;
    }
    @Override
    public String toString(){
        return "Pojazd jest wypożyczony przez "+ person;
    }
}
