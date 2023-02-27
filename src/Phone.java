public class Phone {
    String brand;
    final String model;
    Integer yearOfProduction;
    Double batteryLife;
    String color;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(Integer yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public Double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(Double batteryLife) {
        this.batteryLife = batteryLife;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}

