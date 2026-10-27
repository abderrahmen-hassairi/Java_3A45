package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

import java.util.Scanner;

public class ZooManagement {

    // Prosit 1 - Instruction 1
    private int nbrCages = 20;
    private String zooName = "my zoo";

    public void afficherMessage() {
        System.out.println(zooName + " comporte " + nbrCages + " cages");
    }

    public static void main(String[] args) {

        // Prosit 1
        /*
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
        */

        // Prosit 2
        /*
        // Instruction 5
        Animal lion = new Animal();
        lion.setFamily("Félin");
        lion.setName("Lion");
        lion.setAge(5);
        lion.setMammal(true);

        Zoo myZoo = new Zoo();
        myZoo.setName(zoo.zooName);
        myZoo.setCity("Tunis");

        // Instructions 6 et 7
        Animal tigre = new Animal("Félin", "Tigre", 7, true);
        Animal aigle = new Animal("Oiseau", "Aigle", 3, false);
        Animal serpent = new Animal("Reptile", "Serpent", 4, false);

        myZoo = new Zoo(zoo.zooName, "Tunis");

        // Instruction 8
        System.out.println();
        myZoo.displayZoo();

        // Instruction 9
        System.out.println();
        System.out.println(myZoo);
        System.out.println(lion);
        */

        // Prosit 3
        /*
        // Instruction 10
        System.out.println();
        System.out.println("Ajout du lion    : " + myZoo.addAnimal(lion));
        System.out.println("Ajout du tigre   : " + myZoo.addAnimal(tigre));
        System.out.println("Ajout de l'aigle : " + myZoo.addAnimal(aigle));
        System.out.println("Ajout du serpent : " + myZoo.addAnimal(serpent));

        // Instruction 11
        System.out.println();
        System.out.println("Les animaux de " + myZoo.getName() + " :");
        myZoo.displayAnimals();

        System.out.println();
        System.out.println("Indice du lion             : " + myZoo.searchAnimal(lion));
        Animal lionBis = new Animal("Félin", "Lion", 5, true);
        System.out.println("Indice d'un lion identique : " + myZoo.searchAnimal(lionBis));

        // Instruction 12
        System.out.println();
        System.out.println("Ajouter le lion une 2e fois : " + myZoo.addAnimal(lion));
        System.out.println("Ajouter le lion identique   : " + myZoo.addAnimal(lionBis));

        Animal[] pensionnaires = {
                new Animal("Girafidé", "Girafe", 8, true),
                new Animal("Éléphantidé", "Éléphant", 15, true),
                new Animal("Équidé", "Zèbre", 6, true),
                new Animal("Ursidé", "Panda", 4, true),
                new Animal("Primate", "Gorille", 12, true),
                new Animal("Primate", "Chimpanzé", 9, true),
                new Animal("Marsupial", "Kangourou", 5, true),
                new Animal("Hippopotamidé", "Hippopotame", 20, true),
                new Animal("Rhinocérotidé", "Rhinocéros", 18, true),
                new Animal("Félin", "Guépard", 6, true),
                new Animal("Félin", "Léopard", 7, true),
                new Animal("Canidé", "Loup", 5, true),
                new Animal("Canidé", "Renard", 3, true),
                new Animal("Ursidé", "Ours", 11, true),
                new Animal("Delphinidé", "Dauphin", 9, true),
                new Animal("Camélidé", "Chameau", 10, true),
                new Animal("Camélidé", "Lama", 4, true),
                new Animal("Oiseau", "Flamant", 6, false),
                new Animal("Oiseau", "Perroquet", 8, false),
                new Animal("Oiseau", "Pingouin", 2, false),
                new Animal("Oiseau", "Autruche", 7, false),
                new Animal("Oiseau", "Hibou", 3, false),
                new Animal("Reptile", "Crocodile", 25, false),
                new Animal("Reptile", "Tortue", 40, false),
                new Animal("Reptile", "Iguane", 5, false)
        };

        Zoo friguia = new Zoo("Friguia Park", "Hammamet");
        for (Animal pensionnaire : pensionnaires) {
            friguia.addAnimal(pensionnaire);
        }

        System.out.println();
        System.out.println("Animaux proposes     : " + pensionnaires.length);
        System.out.println("Animaux acceptes     : " + friguia.getNbrAnimals() + " / " + Zoo.NBR_CAGES);
        System.out.println("Friguia Park plein ? : " + friguia.isZooFull());
        Animal panthere = new Animal("Félin", "Panthère", 6, true);
        System.out.println("Ajout d'un 26e animal : " + friguia.addAnimal(panthere));

        // Instruction 13
        System.out.println();
        System.out.println("Suppression du tigre  : " + myZoo.removeAnimal(tigre));
        System.out.println("Supprimer le tigre 2x : " + myZoo.removeAnimal(tigre));
        System.out.println("Les animaux restants :");
        myZoo.displayAnimals();

        // Instruction 15
        System.out.println();
        System.out.println(myZoo.getName() + " est plein ? : " + myZoo.isZooFull());
        Zoo plusGrand = Zoo.comparerZoo(myZoo, friguia);
        System.out.println("Le plus grand zoo : " + plusGrand.getName() + " (" + plusGrand.getNbrAnimals() + " animaux)");
        */

        // Prosit 4
        /*
        // Instruction 17
        System.out.println("Prosit 4 : Instruction 17 ");
        Zoo voliere = new Zoo("Volière de Tunis", "Tunis");
        for (int i = 1; i <= Zoo.NBR_CAGES; i++) {
            voliere.addAnimal(new Animal("Oiseau", "Perruche " + i, 1, false));
        }
        System.out.println("Oiseaux dans la volière : " + voliere.getNbrAnimals() + " / " + Zoo.NBR_CAGES);
        System.out.println("Volière pleine ?        : " + voliere.isZooFull());
        Animal canari = new Animal("Oiseau", "Canari", 2, false);
        System.out.println("Ajout d'un canari       : " + voliere.addAnimal(canari));

        // Instruction 18
        System.out.println();
        System.out.println("Prosit 4 : Instruction 18 ");
        Animal chameau = new Animal("Camélidé", "Chameau", 10, true);
        chameau.setAge(-4);
        System.out.println("Âge du chameau après setAge(-4) : " + chameau.getAge());

        Animal lionceau = new Animal("Félin", "Lionceau", -1, true);
        System.out.println("Âge du lionceau créé avec -1    : " + lionceau.getAge());

        Zoo belvedere = new Zoo("Belvédère", "Tunis");
        belvedere.setName("");
        System.out.println("Nom du zoo après setName(\"\")    : " + belvedere.getName());

        belvedere.addAnimal(chameau);
        System.out.println(belvedere.getName() + " (" + belvedere.getCity() + ") : " + belvedere.getNbrAnimals() + " animal");
        System.out.println(chameau);

        // Instruction 19 : packages entities et main
        */

        // Prosit 5

        // Instruction 21
        System.out.println("Prosit 5 : Instruction 21");
        Aquatic aquatic = new Aquatic();
        Terrestrial terrestrial = new Terrestrial();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();
        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);

        // Instruction 22
        Aquatic requin = new Aquatic("Poisson", "Requin", 12, false, "Océan");
        Terrestrial elephant = new Terrestrial("Éléphantidé", "Éléphant", 15, true, 4);
        Dolphin dauphin = new Dolphin("Delphinidé", "Dauphin", 9, true, "Mer", 35.0f);
        Penguin pingouin = new Penguin("Sphéniscidé", "Pingouin", 4, false, "Banquise", 120.5f);

        // Instruction 23
        System.out.println();
        System.out.println("Prosit 5 : Instruction 23");
        System.out.println(requin);
        System.out.println(elephant);
        System.out.println(dauphin);
        System.out.println(pingouin);

        // Instruction 24
        System.out.println();
        System.out.println("Prosit 5 : Instruction 24");
        requin.swim();
        dauphin.swim();
        pingouin.swim();
    }
}
