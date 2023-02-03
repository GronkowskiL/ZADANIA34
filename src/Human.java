
public class Human {
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
}
