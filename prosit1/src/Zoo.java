public class Zoo {

    // Instruction 14 : constante de classe, partagee par tous les zoos
    static final int NBR_CAGES = 25;

    Animal[] animals;
    String name;
    String city;
    int nbrAnimals;

    public Zoo() {
        this.animals = new Animal[NBR_CAGES];
    }

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
    }

    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + NBR_CAGES);
    }

    // Instruction 15
    public boolean isZooFull() {
        return nbrAnimals >= NBR_CAGES;
    }

    // Instruction 11 : recherche par nom, retourne l'indice ou -1
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    // Instructions 10 et 12
    public boolean addAnimal(Animal animal) {
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

    // Instruction 13
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

    // Instruction 11
    public void displayAnimals() {
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    // Instruction 15 : methode de classe, ne depend d'aucun zoo particulier
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals >= z2.nbrAnimals) {
            return z1;
        }
        return z2;
    }

    public String toString() {
        return "Zoo [name=" + name + ", city=" + city + ", nbrCages=" + NBR_CAGES + "]";
    }
}
