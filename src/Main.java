

public class Main {
    public static void main(String[] args) {
        Human me = new Human("Lucas", "Gronek", 1990);
        Animal cat = new Animal("Ciapak");
        cat.name = "kot";
        cat.weight = 10.3;
        me.setPet(cat);

        System.out.println("Imię: " + me.firstName + " " + me.lastName);
        System.out.println("Rok urodzenia: " + me.yearOfBirth);
        System.out.println("Masz zwierzę, nazywa się: " + me.pet.name);
        System.out.println("Gatunek: " + me.pet.species);
        System.out.println("Czy żyje: " + me.pet.isAlive);

        Phone iPhone = new Phone("Apple", "iPhone 13");
        iPhone.setYearOfProduction(2021);
        iPhone.setBatteryLife(0.7);
        iPhone.setColor("gold");
        me.setPhone(iPhone);

        System.out.println("Masz telefon marki " + me.phone.brand + " model " + me.phone.model);
        System.out.println("Rok produkcji: " + me.phone.yearOfProduction);
        System.out.println("Poziom baterii: " + me.phone.batteryLife);
        System.out.println("Kolor: " + me.phone.color);

        Car car = new Car("monedo ST", "FORD");
        me.setDevice(car);

        System.out.println("Masz urządzenie marki " + me.device.producer + " model " + me.device.model);
    }
}