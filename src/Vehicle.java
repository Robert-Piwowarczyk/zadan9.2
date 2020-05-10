abstract class Vehicle implements Moveable {
    private static final String FORWARD = "do przodu";
    private static final String BACK = "do tyłu";
    private static final String RIGHT = "w prawo";
    private static final String LEFT = "w lewo";

    private String name;
    private int year;
    private String go;

    public Vehicle(String name, int year, String go) {
        this.name = name;
        this.year = year;
        this.go = go;
    }

    public String getGo() {
        return go;
    }

    public void setGo(String go) {
        this.go = go;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void turnLeft() {
        go = LEFT;
    }

    @Override
    public void turnRight() {
        go = RIGHT;
    }

    @Override
    public void goForward() {
        go = FORWARD;
    }

    @Override
    public void goBack() {
        go = BACK;
    }

    @Override
    public String toString() {
        return "pojazd jedzie w stronę " + go;
    }
}

