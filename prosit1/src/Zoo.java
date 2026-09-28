public class Zoo {

    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo() {
        this.animals = new Animal[25];
    }

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];
    }

    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }

    public String toString() {
        return "Zoo [name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + "]";
    }
}
