package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {

    // Prosit 5 - Instructions 20 et 22
    protected int nbrLegs;

    // Prosit 5 - Instruction 22
    public Terrestrial() {
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    // Prosit 5 - Instruction 23
    public String toString() {
        return "Terrestrial [family=" + getFamily() + ", name=" + getName() + ", age=" + getAge()
                + ", isMammal=" + isMammal() + ", nbrLegs=" + nbrLegs + "]";
    }
}
