package tn.esprit.gestionemploye.interfaces;

import java.util.List;

// Prosit 8 - Partie IV
public interface IRechercheAvancee<T> {

    List<T> rechercherParDepartement(String nomDepartement);
}
