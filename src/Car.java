public class Car {
    private String model;
    private String producer;
    private int yearOfProduction;
    private double fuelConsumption;
    private String color;
    private double value;

    public Car(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
