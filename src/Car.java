public class Car {
    String color;
    int year;
    String model;
    double volume;

    public Car(String color, int year, String model, double volume) {
        this.color = color;
        this.year = year;
        this.model = model;
        this.volume = volume;
    }


    public String printInfo() {
        return color + " " + year + " " + model + " " + volume;
    }

    public Car(int year, double volume) {
        this.volume = volume;
        this.year = year;
    }


}
