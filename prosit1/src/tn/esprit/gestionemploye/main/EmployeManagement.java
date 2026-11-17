package tn.esprit.gestionemploye.main;

import tn.esprit.gestionemploye.entities.Employe;
import tn.esprit.gestionemploye.entities.SocieteArrayList;

import java.util.List;

public class EmployeManagement {

    public static void main(String[] args) {

        // Prosit 8

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
    }
}
