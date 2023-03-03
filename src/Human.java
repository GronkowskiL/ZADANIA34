//import Device.Device;

import java.util.Date;

public class Human {
    private Double salary;
    private Car car;
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    public Animal pet;
    private Phone phone;

    public Human(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public Animal getPet() {
        return pet;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Phone getPhone() {
        return phone;
    }

    public Double getSalary() {
        System.out.println("Pobrano informacje o wynagrodzeniu " + new Date());
        System.out.println("Wynagrodzenie wynosi: " + salary);
        return salary;
    }

    public void setSalary(Double newSalary) {
        if (newSalary < 0) {
            System.out.println("Nie można przypisać ujemnej wartości wynagrodzenia");
            return;
        }
        System.out.println("Wysłano nowe dane o wynagrodzeniu do systemu księgowego");
        System.out.println("Konieczne jest odebranie aneksu do umowy od pani Hani z kadr");
        System.out.println("ZUS i US już wiedzą o zmianie wynagrodzenia, nie ma sensu ukrywać dochodu");
        this.salary = newSalary;
    }

    public void buyCar(Car car) {
        Double carValue = car.getValue();
        if (salary >= carValue) { // if the salary is sufficient to buy the car
            System.out.println("Udało się kupić samochód za gotówkę!");
            this.car = car;
        } else if (salary >= carValue / 12) { // if the salary is sufficient to buy the car on credit
            System.out.println("Udało się kupić samochód na kredyt!");
            this.car = car;
        } else { // if the salary is not sufficient to buy the car
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

//    public Device getDevice() {
////        return device;
//
//    }
//
////    public void setDevice(Device device) {
////        this.device = device;
//    }
}
