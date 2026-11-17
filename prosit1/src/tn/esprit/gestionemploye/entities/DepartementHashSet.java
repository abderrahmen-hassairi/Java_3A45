package tn.esprit.gestionemploye.entities;

import tn.esprit.gestionemploye.interfaces.IDepartement;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// Prosit 9 - Partie III
public class DepartementHashSet implements IDepartement<Departement> {

    private Set<Departement> departements = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement departement) {
        if (!departements.add(departement)) {
            System.out.println("Le département " + departement.getNomDepartement()
                    + " (id " + departement.getId() + ") existe déjà.");
        }
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        for (Departement departement : departements) {
            if (departement.getNomDepartement().equals(nomDepartement)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);
    }

    @Override
    public void afficherDepartements() {
        for (Departement departement : departements) {
            System.out.println(departement);
        }
    }

    @Override
    public void trierDepartementsParId() {
        Set<Departement> tries = new TreeSet<>(departements);
        for (Departement departement : tries) {
            System.out.println(departement);
        }
    }

    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        Set<Departement> tries = new TreeSet<>(new DepartementComparator());
        tries.addAll(departements);
        for (Departement departement : tries) {
            System.out.println(departement);
        }
    }
}
