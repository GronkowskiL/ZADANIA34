//package devices;

import java.util.Objects;

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfProduction == car.yearOfProduction &&
                Double.compare(car.fuelConsumption, fuelConsumption) == 0 &&
                Double.compare(car.value, value) == 0 &&
                Objects.equals(model, car.model) &&
                Objects.equals(producer, car.producer) &&
                Objects.equals(color, car.color);
    }


    @Override
    public int hashCode() {
        return Objects.hash(model, producer, yearOfProduction, fuelConsumption, color, value);
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", fuelConsumption=" + fuelConsumption +
                ", color='" + color + '\'' +
                ", value=" + value +
                '}';
    }
}