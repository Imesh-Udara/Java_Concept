package BroCode.fifthDay.CopyOfObject;

public class Car {
    String name;
    String model;
    int year;

    Car(String name, String model, int year){
        this.setName(name);
        this.setModel(model);
        this.setYear(year);
    }

    Car(Car x){
        this.copy(x);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void copy(Car x){
        this.setName(x.getName());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }
}
