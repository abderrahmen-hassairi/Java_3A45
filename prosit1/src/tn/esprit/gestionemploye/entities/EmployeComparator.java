package tn.esprit.gestionemploye.entities;

import java.util.Comparator;

// Prosit 8 - Partie III
public class EmployeComparator implements Comparator<Employe> {

    public int compare(Employe e1, Employe e2) {
        int resultat = e1.getNomDepartement().compareTo(e2.getNomDepartement());
        if (resultat == 0) {
            resultat = Integer.compare(e1.getGrade(), e2.getGrade());
        }
        if (resultat == 0) {
            resultat = e1.getNom().compareTo(e2.getNom());
        }
        return resultat;
    }
}
