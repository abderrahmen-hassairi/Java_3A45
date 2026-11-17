package tn.esprit.gestionemploye.entities;

public class Departement implements Comparable<Departement> {

    // Prosit 9 - Partie I
    private int id;
    private String nomDepartement;
    private int nombreEmployes;

    // Prosit 9 - Partie I
    public Departement() {
    }

    public Departement(int id, String nomDepartement, int nombreEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nombreEmployes = nombreEmployes;
    }

    // Prosit 9 - Partie I
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }

    // Prosit 9 - Partie I
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Departement)) {
            return false;
        }
        Departement other = (Departement) obj;
        return id == other.id && nomDepartement.equals(other.nomDepartement);
    }

    // Prosit 9 - Partie III
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + id;
        result = 31 * result + nomDepartement.hashCode();
        return result;
    }

    // Prosit 9 - Partie I
    @Override
    public String toString() {
        return "Departement [id=" + id + ", nomDepartement=" + nomDepartement
                + ", nombreEmployes=" + nombreEmployes + "]";
    }

    // Prosit 9 - Partie III
    @Override
    public int compareTo(Departement other) {
        int resultat = Integer.compare(id, other.id);
        if (resultat == 0) {
            resultat = nomDepartement.compareTo(other.nomDepartement);
        }
        return resultat;
    }
}
