public class Car {
    final String model;
    final String producer;
    Integer yearOfProduction;
    Double fuelConsumption;
    String color;

    public Car(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }

    public void setYearOfProduction(Integer yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setFuelConsumption(Double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
