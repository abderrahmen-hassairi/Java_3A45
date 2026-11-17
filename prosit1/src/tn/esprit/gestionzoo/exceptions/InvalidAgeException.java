package tn.esprit.gestionzoo.exceptions;

// Prosit 7 - Instruction 34
public class InvalidAgeException extends Exception {

    public InvalidAgeException() {
        super("Âge d'animal invalide : l'âge ne peut pas être négatif.");
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}
