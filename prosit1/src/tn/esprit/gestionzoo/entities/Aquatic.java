package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {

    // Prosit 5 - Instructions 20 et 22
    protected String habitat;

    // Prosit 5 - Instruction 22
    public Aquatic() {
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    // Prosit 5 - Instruction 24 / Prosit 6 - Instruction 26
    public abstract void swim();

    // Prosit 5 - Instruction 23
    public String toString() {
        return "Aquatic [family=" + getFamily() + ", name=" + getName() + ", age=" + getAge()
                + ", isMammal=" + isMammal() + ", habitat=" + habitat + "]";
    }

    // Prosit 6 - Instruction 31
    public boolean equals(Object obj) {
        if (!(obj instanceof Aquatic)) {
            return false;
        }
        Aquatic other = (Aquatic) obj;
        return getName().equals(other.getName())
                && getAge() == other.getAge()
                && habitat.equals(other.habitat);
    }
}
