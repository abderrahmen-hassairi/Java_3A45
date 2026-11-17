package tn.esprit.gestionemploye.entities;

import java.util.Comparator;

// Prosit 9 - Partie III
public class DepartementComparator implements Comparator<Departement> {

    @Override
    public int compare(Departement d1, Departement d2) {
        int resultat = d1.getNomDepartement().compareTo(d2.getNomDepartement());
        if (resultat == 0) {
            resultat = Integer.compare(d1.getNombreEmployes(), d2.getNombreEmployes());
        }
        if (resultat == 0) {
            resultat = Integer.compare(d1.getId(), d2.getId());
        }
        return resultat;
    }
}
