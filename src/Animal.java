public class Animal {
    final String species;
    String name;
    Double weight;
    Boolean isAlive;

    public Animal(String species) {
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

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public Double getWeight() {
        return weight;
    }

    public Boolean isAlive() {
        return isAlive;
    }
}
