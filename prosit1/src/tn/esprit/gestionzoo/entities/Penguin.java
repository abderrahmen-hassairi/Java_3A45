package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {

    // Prosit 5 - Instructions 20 et 22
    protected float swimmingDepth;

    // Prosit 5 - Instruction 22
    public Penguin() {
    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    // Prosit 5 - Instruction 23
    public String toString() {
        return "Penguin [family=" + getFamily() + ", name=" + getName() + ", age=" + getAge()
                + ", isMammal=" + isMammal() + ", habitat=" + habitat + ", swimmingDepth=" + swimmingDepth + "]";
    }
}
