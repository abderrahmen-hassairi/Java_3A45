package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {

    // Prosit 5 - Instructions 20 et 22
    protected String habitat;

    // Prosit 5 - Instruction 22
    public Aquatic() {
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    // Prosit 5 - Instruction 24
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    // Prosit 5 - Instruction 23
    public String toString() {
        return "Aquatic [family=" + getFamily() + ", name=" + getName() + ", age=" + getAge()
                + ", isMammal=" + isMammal() + ", habitat=" + habitat + "]";
    }
}
