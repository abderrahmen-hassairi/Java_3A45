package tn.esprit.gestionzoo.exceptions;

// Prosit 7 - Instruction 33
public class ZooFullException extends Exception {

    public ZooFullException() {
        super("Le zoo est plein, impossible d'ajouter un nouvel animal.");
    }

    public ZooFullException(String message) {
        super(message);
    }
}
