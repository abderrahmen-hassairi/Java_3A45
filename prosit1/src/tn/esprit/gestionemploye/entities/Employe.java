package tn.esprit.gestionemploye.entities;

public class Employe implements Comparable<Employe> {

    // Prosit 8 - Partie I
    private int id;
    private String nom;
    private String prenom;
    private String nomDepartement;
    private int grade;

    // Prosit 8 - Partie I
    public Employe() {
    }

    public Employe(int id, String nom, String prenom, String nomDepartement, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepartement = nomDepartement;
        this.grade = grade;
    }

    // Prosit 8 - Partie I
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // Prosit 8 - Partie I
    public String toString() {
        return "Employe [id=" + id + ", nom=" + nom + ", prenom=" + prenom
                + ", nomDepartement=" + nomDepartement + ", grade=" + grade + "]";
    }

    // Prosit 8 - Partie III
    public boolean equals(Object obj) {
        if (!(obj instanceof Employe)) {
            return false;
        }
        Employe other = (Employe) obj;
        return id == other.id;
    }

    // Prosit 8 - Partie III
    public int compareTo(Employe other) {
        return Integer.compare(id, other.id);
    }
}
