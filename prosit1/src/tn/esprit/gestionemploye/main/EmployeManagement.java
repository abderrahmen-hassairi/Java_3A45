package tn.esprit.gestionemploye.main;

import tn.esprit.gestionemploye.entities.Departement;
import tn.esprit.gestionemploye.entities.DepartementHashSet;
import tn.esprit.gestionemploye.entities.Employe;
import tn.esprit.gestionemploye.entities.SocieteArrayList;

import java.util.List;

public class EmployeManagement {

    public static void main(String[] args) {

        // Prosit 8
        /*
        // Partie III
        System.out.println("Prosit 8 : Partie III");
        SocieteArrayList societe = new SocieteArrayList();
        Employe hammami = new Employe(103, "Hammami", "Ines", "Marketing", 1);

        societe.ajouterEmploye(new Employe(104, "Gharbi", "Mehdi", "Informatique", 3));
        societe.ajouterEmploye(new Employe(101, "Ben Salah", "Yasmine", "Ressources Humaines", 2));
        societe.ajouterEmploye(new Employe(107, "Jlassi", "Oussema", "Informatique", 2));
        societe.ajouterEmploye(new Employe(102, "Mejri", "Sarra", "Finance", 4));
        societe.ajouterEmploye(new Employe(108, "Ayari", "Firas", "Informatique", 3));
        societe.ajouterEmploye(hammami);
        societe.ajouterEmploye(new Employe(106, "Dridi", "Wassim", "Finance", 2));
        societe.ajouterEmploye(new Employe(105, "Khelifi", "Rania", "Ressources Humaines", 2));

        System.out.println("Liste des employés :");
        societe.displayEmploye();

        System.out.println();
        System.out.println("Recherche de \"Jlassi\"      : " + societe.rechercherEmploye("Jlassi"));
        System.out.println("Recherche de \"Mansouri\"    : " + societe.rechercherEmploye("Mansouri"));
        Employe copie = new Employe(104, "Gharbi", "Mehdi", "Informatique", 3);
        System.out.println("Recherche de l'employé 104 : " + societe.rechercherEmploye(copie));

        System.out.println();
        societe.supprimerEmploye(hammami);
        System.out.println("Après suppression de Hammami :");
        System.out.println("Recherche de \"Hammami\"     : " + societe.rechercherEmploye("Hammami"));

        System.out.println();
        System.out.println("Tri naturel (par id) :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println();
        System.out.println("Tri personnalisé (département, puis grade, puis nom) :");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();

        // Partie IV
        System.out.println();
        System.out.println("Prosit 8 : Partie IV");
        List<Employe> informaticiens = societe.rechercherParDepartement("Informatique");
        System.out.println("Employés du département Informatique : " + informaticiens.size());
        for (Employe employe : informaticiens) {
            System.out.println(employe);
        }
        */

        // Prosit 9

        // Partie III
        System.out.println("Prosit 9 : Partie III");
        DepartementHashSet departements = new DepartementHashSet();
        Departement marketing = new Departement(4, "Marketing", 6);

        departements.ajouterDepartement(new Departement(3, "Finance", 8));
        departements.ajouterDepartement(new Departement(1, "Informatique", 12));
        departements.ajouterDepartement(new Departement(5, "Ressources Humaines", 5));
        departements.ajouterDepartement(marketing);
        departements.ajouterDepartement(new Departement(2, "Logistique", 9));
        departements.ajouterDepartement(new Departement(6, "Informatique", 4));

        System.out.println("Ajout d'un doublon (même id et même nom) :");
        departements.ajouterDepartement(new Departement(1, "Informatique", 15));

        System.out.println();
        System.out.println("Départements (HashSet, sans ordre) :");
        departements.afficherDepartements();

        System.out.println();
        System.out.println("Recherche de \"Finance\"            : " + departements.rechercherDepartement("Finance"));
        System.out.println("Recherche de \"Juridique\"          : " + departements.rechercherDepartement("Juridique"));
        Departement copieFinance = new Departement(3, "Finance", 0);
        System.out.println("Recherche de (3, Finance)         : " + departements.rechercherDepartement(copieFinance));
        Departement autreNom = new Departement(3, "Marketing", 8);
        System.out.println("Recherche de (3, Marketing)       : " + departements.rechercherDepartement(autreNom));

        System.out.println();
        departements.supprimerDepartement(marketing);
        System.out.println("Après suppression de Marketing :");
        System.out.println("Recherche de \"Marketing\"          : " + departements.rechercherDepartement("Marketing"));

        System.out.println();
        System.out.println("Tri par id :");
        departements.trierDepartementsParId();

        System.out.println();
        System.out.println("Tri par nom, puis nombre d'employés :");
        departements.trierDepartementsParNomEtNombreEmployes();
    }
}
