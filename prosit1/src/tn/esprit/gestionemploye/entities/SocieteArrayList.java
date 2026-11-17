package tn.esprit.gestionemploye.entities;

import tn.esprit.gestionemploye.interfaces.IGestion;
import tn.esprit.gestionemploye.interfaces.IRechercheAvancee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Prosit 8 - Parties III et IV
public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {

    // Prosit 8 - Partie III
    private List<Employe> employes = new ArrayList<>();

    // Prosit 8 - Partie III
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    public boolean rechercherEmploye(String nom) {
        for (Employe employe : employes) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }

    public void displayEmploye() {
        for (Employe employe : employes) {
            System.out.println(employe);
        }
    }

    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(employes, new EmployeComparator());
    }

    // Prosit 8 - Partie IV
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> resultat = new ArrayList<>();
        for (Employe employe : employes) {
            if (employe.getNomDepartement().equals(nomDepartement)) {
                resultat.add(employe);
            }
        }
        return resultat;
    }
}
