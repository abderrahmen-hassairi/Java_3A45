package tn.esprit.gestionzoo.entities;

public class Zoo {

    // Prosit 3 - Instruction 14
    public static final int NBR_CAGES = 25;

    // Prosit 6 - Instruction 25
    public static final int MAX_AQUATIC_ANIMALS = 10;

    // Prosit 2 - Instruction 5
    private Animal[] animals;
    private String name;
    private String city;

    // Prosit 3 - Instruction 10
    private int nbrAnimals;

    // Prosit 6 - Instruction 25
    private Aquatic[] aquaticAnimals;
    private int nbrAquaticAnimals;

    // Prosit 2 - Instruction 7
    public Zoo() {
        this.animals = new Animal[NBR_CAGES];
        this.aquaticAnimals = new Aquatic[MAX_AQUATIC_ANIMALS];
    }

    // Prosit 2 - Instruction 6
    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
        this.aquaticAnimals = new Aquatic[MAX_AQUATIC_ANIMALS];
    }

    // Prosit 4 - Instruction 18
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().isEmpty()) {
            System.out.println("Erreur : le nom du zoo ne doit pas être vide.");
        } else {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public int getNbrAquaticAnimals() {
        return nbrAquaticAnimals;
    }

    // Prosit 2 - Instruction 8
    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + NBR_CAGES);
    }

    // Prosit 3 - Instruction 15
    public boolean isZooFull() {
        return nbrAnimals >= NBR_CAGES;
    }

    // Prosit 3 - Instruction 11
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    // Prosit 3 - Instructions 10 et 12
    public boolean addAnimal(Animal animal) {
        // Prosit 4 - Instruction 17
        if (isZooFull()) {
            return false;
        }
        if (searchAnimal(animal) != -1) {
            return false;
        }
        animals[nbrAnimals] = animal;
        nbrAnimals = nbrAnimals + 1;
        return true;
    }

    // Prosit 3 - Instruction 13
    public boolean removeAnimal(Animal animal) {
        int position = searchAnimal(animal);
        if (position == -1) {
            return false;
        }
        for (int i = position; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }
        nbrAnimals = nbrAnimals - 1;
        return true;
    }

    // Prosit 3 - Instruction 11
    public void displayAnimals() {
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    // Prosit 3 - Instruction 15
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals >= z2.nbrAnimals) {
            return z1;
        }
        return z2;
    }

    // Prosit 6 - Instruction 25
    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbrAquaticAnimals >= MAX_AQUATIC_ANIMALS) {
            System.out.println("Erreur : le zoo ne peut pas contenir plus de " + MAX_AQUATIC_ANIMALS + " animaux aquatiques.");
        } else {
            aquaticAnimals[nbrAquaticAnimals] = aquatic;
            nbrAquaticAnimals = nbrAquaticAnimals + 1;
        }
    }

    // Prosit 6 - Instruction 26
    public void swimAquaticAnimals() {
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            System.out.print(aquaticAnimals[i].getName() + " : ");
            aquaticAnimals[i].swim();
        }
    }

    // Prosit 6 - Instruction 27
    public float maxPenguinSwimmingDepth() {
        float max = 0;
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                if (penguin.swimmingDepth > max) {
                    max = penguin.swimmingDepth;
                }
            }
        }
        return max;
    }

    // Prosit 6 - Instruction 28
    public void displayNumberOfAquaticsByType() {
        int nbrDolphins = 0;
        int nbrPenguins = 0;
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                nbrDolphins++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                nbrPenguins++;
            }
        }
        System.out.println("Nombre de dauphins : " + nbrDolphins);
        System.out.println("Nombre de pingouins : " + nbrPenguins);
    }

    // Prosit 2 - Instruction 9
    public String toString() {
        return "Zoo [name=" + name + ", city=" + city + ", nbrCages=" + NBR_CAGES + "]";
    }
}
