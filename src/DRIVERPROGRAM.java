public class DRIVERPROGRAM {
    public static void main(String[] args) {
        ANIMALFACTORY animalfactory = new ANIMALFACTORY();

        Animal gato = animalfactory.getAnimal("GATO");
        Animal perro = animalfactory.getAnimal("PERRO");

        gato.speak();
        perro.speak();

    }
}
