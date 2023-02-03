import java.util.Date;

public class Human {
    private Double salary;

    String firstName;
    String lastName;
    int yearOfBirth;
    Animal pet;
    Phone phone;
    Car device;

    public Human(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void setDevice(Car device) {
        this.device = device;
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
}
