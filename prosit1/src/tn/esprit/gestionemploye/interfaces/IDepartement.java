package tn.esprit.gestionemploye.interfaces;

// Prosit 9 - Partie II
public interface IDepartement<T> {

    public void ajouterDepartement(T t);

    public boolean rechercherDepartement(String nomDepartement);

    public boolean rechercherDepartement(T t);

    public void supprimerDepartement(T t);

    public void afficherDepartements();

    public void trierDepartementsParId();

    public void trierDepartementsParNomEtNombreEmployes();
}
