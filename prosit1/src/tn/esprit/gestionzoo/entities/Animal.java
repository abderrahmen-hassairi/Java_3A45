package tn.esprit.gestionzoo.entities;

public class Animal {

    // Prosit 2 - Instruction 5
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    // Prosit 2 - Instruction 7
    public Animal() {
    }

    // Prosit 2 - Instruction 6
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;
    }

    // Prosit 4 - Instruction 18
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Erreur : l'âge d'un animal ne peut pas être négatif.");
        } else {
            this.age = age;
        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }

    // Prosit 2 - Instruction 9
    public String toString() {
        return "Animal [family=" + family + ", name=" + name + ", age=" + age + ", isMammal=" + isMammal + "]";
    }
}
