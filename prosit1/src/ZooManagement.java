import java.util.Scanner;

public class ZooManagement {

    int nbrCages = 20;
    String zooName = "my zoo";

    public void afficherMessage() {
        System.out.println(zooName + " comporte " + nbrCages + " cages");
    }

    public static void main(String[] args) {

        // Instruction 1
        ZooManagement zoo = new ZooManagement();
        zoo.afficherMessage();

        // Instruction 2
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

        int cages;
        do {
            System.out.print("Entrez le nombre de cages : ");
            while (!scanner.hasNextInt()) {
                System.out.println("Erreur : veuillez entrer un entier valide.");
                scanner.next();
                System.out.print("Entrez le nombre de cages : ");
            }
            cages = scanner.nextInt();
            if (cages <= 0) {
                System.out.println("Erreur : le nombre de cages doit être un entier positif.");
            }
        } while (cages <= 0);
        zoo.nbrCages = cages;

        // Instruction 3
        zoo.afficherMessage();
        scanner.close();

        // Instruction 5
        Animal lion = new Animal();
        lion.family = "Félin";
        lion.name = "Lion";
        lion.age = 5;
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.name = zoo.zooName;
        myZoo.city = "Tunis";
        myZoo.nbrCages = zoo.nbrCages;

        // Instructions 6 et 7
        Animal tigre = new Animal("Félin", "Tigre", 7, true);
        Animal aigle = new Animal("Oiseau", "Aigle", 3, false);
        Animal serpent = new Animal("Reptile", "Serpent", 4, false);

        myZoo = new Zoo(zoo.zooName, "Tunis", zoo.nbrCages);
        myZoo.animals[0] = lion;
        myZoo.animals[1] = tigre;
        myZoo.animals[2] = aigle;
        myZoo.animals[3] = serpent;

        // Instruction 8
        System.out.println();
        myZoo.displayZoo();

        // Instruction 9
        System.out.println();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        for (int i = 0; i < 4; i++) {
            System.out.println(myZoo.animals[i]);
        }
    }
}
