import java.util.Scanner;

class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    Animal() {
    }

    Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal [family=" + family + ", name=" + name + ", age=" + age + ", isMammal=" + isMammal + "]";
    }
}

class Zoo {
    static final int MAX_ANIMALS = 25;

    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    Zoo() {
        this.animals = new Animal[MAX_ANIMALS];
    }

    Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[MAX_ANIMALS];
    }

    void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo [name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + "]";
    }
}

public class ZooManagement {

    int nbrCages = 20;
    String zooName = "my zoo";

    void afficherMessage() {
        System.out.println(zooName + " comporte " + nbrCages + " cages");
    }

    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();
        zoo.afficherMessage();

        Scanner scanner = new Scanner(System.in);

        String nom;
        do {
            System.out.print("Entrez le nom du zoo : ");
            nom = scanner.nextLine().trim();
            if (nom.isEmpty()) {
                System.out.println("Erreur : le nom du zoo ne doit pas être vide.");
            }
        } while (nom.isEmpty());
        zoo.zooName = nom;

        int cages = 0;
        boolean valide = false;
        do {
            System.out.print("Entrez le nombre de cages : ");
            String saisie = scanner.nextLine().trim();
            try {
                cages = Integer.parseInt(saisie);
                if (cages > 0) {
                    valide = true;
                } else {
                    System.out.println("Erreur : le nombre de cages doit être un entier positif.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erreur : veuillez entrer un entier valide.");
            }
        } while (!valide);
        zoo.nbrCages = cages;

        zoo.afficherMessage();
        scanner.close();

        Animal lion = new Animal();
        lion.family = "Félin";
        lion.name = "Lion";
        lion.age = 5;
        lion.isMammal = true;

        Animal tigre = new Animal("Félin", "Tigre", 7, true);
        Animal aigle = new Animal("Oiseau", "Aigle", 3, false);
        Animal serpent = new Animal("Reptile", "Serpent", 4, false);

        Zoo myZoo = new Zoo(zoo.zooName, "Tunis", zoo.nbrCages);
        myZoo.animals[0] = lion;
        myZoo.animals[1] = tigre;
        myZoo.animals[2] = aigle;
        myZoo.animals[3] = serpent;

        System.out.println();
        myZoo.displayZoo();

        System.out.println();
        System.out.println(myZoo);

        for (int i = 0; i < myZoo.animals.length; i++) {
            if (myZoo.animals[i] != null) {
                System.out.println(myZoo.animals[i]);
            }
        }
    }
}
