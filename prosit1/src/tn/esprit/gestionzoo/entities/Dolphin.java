package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {

    // Prosit 5 - Instructions 20 et 22
    protected float swimmingSpeed;

    // Prosit 5 - Instruction 22
    public Dolphin() {
    }

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    // Prosit 5 - Instruction 24
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    // Prosit 5 - Instruction 23
    public String toString() {
        return "Dolphin [family=" + getFamily() + ", name=" + getName() + ", age=" + getAge()
                + ", isMammal=" + isMammal() + ", habitat=" + habitat + ", swimmingSpeed=" + swimmingSpeed + "]";
    }
}
