public class Animal {
    final String species;
    String name;
    Double weight;
    Boolean isAlive;

    public Animal(String species, String name, Double weight) {
        this.isAlive = true;
        this.species = species;
        this.name = name;
        this.weight = weight;
    }

    void feed() {
        if(isAlive) {
            this.weight += 0.5;
            System.out.println("dzięki za żarcie");
        } else {
            System.out.println("spoko, ale za późno");
        }
    }

    void takeForAWalk() {
        if (isAlive){
            System.out.println("Halo policja");
        } else {
            this.weight -= 0.5;
            System.out.println("dzięki za spacer");
        }
        if (this.weight <= 0) {
            isAlive = false;
        }
    }
}
