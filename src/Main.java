//import java.util.Date;
//import devices.Car;

public class Main {
    public static void main(String[] args) {
        Human me = new Human("Lucas", "Gronek", 1990);
        Animal cat = new Animal("Ciapak");
        cat.setName("kot");
        cat.setWeight(10.3);
        me.setPet(cat);


        System.out.println("Imię: " + me.getFirstName() + " " + me.getLastName());
        System.out.println("Rok urodzenia: " + me.getYearOfBirth());
        System.out.println("Masz zwierzę, nazywa się: " + me.getPet().getName());
        System.out.println("Gatunek: " + me.getPet().getSpecies());
        System.out.println("Czy żyje: " + me.getPet().isAlive());

        Phone iPhone = new Phone("Apple", "iPhone 13");
        iPhone.setYearOfProduction(2021);
        iPhone.setBatteryLife(0.7);
        iPhone.setColor("gold");
        me.setPhone(iPhone);

        System.out.println("Masz telefon marki " + me.getPhone().getBrand() + " model " + me.getPhone().getModel());
        System.out.println("Rok produkcji: " + me.getPhone().getYearOfProduction());
        System.out.println("Poziom baterii: " + me.getPhone().getBatteryLife());
        System.out.println("Kolor: " + me.getPhone().getColor());

        Car car = new Car("Mondeo ST", "FORD");
        car.setYearOfProduction(2010);
        car.setFuelConsumption(8.5);
        car.setColor("black");
        car.setValue(20000.0);
//        me.setDevice(car);

//        System.out.println("Masz urządzenie marki " + me.getDevice().getProducer() + " model " + me.getDevice().getModel());
//        System.out.println("Rok produkcji: " + me.getDevice().getYearOfProduction());
//        System.out.println("Spalanie: " + me.getDevice().getFuelConsumption());
//        System.out.println("Kolor: " + me.getDevice().getColor());
//        System.out.println("Wartość: " + me.getDevice().getValue()); // wyświetlenie wartości samochodu
//
//        Car myCar = me.getDevice();
//        System.out.println("Mój samochód: " + myCar.getProducer() + " " + myCar.getModel());
//
//        Double carValue = me.getDevice().getValue();
//        Double salary = me.getSalary();
//
//        if (salary != null && salary >= carValue) {
//            System.out.println("Udało się kupić za gotówkę");
//            me.setDevice(car);
//        } else if (salary != null && salary >= carValue / 12) {
//            System.out.println("Udało się kupić na kredyt");
//            me.setDevice(car);
//        } else {
//            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
//        }
    }
}