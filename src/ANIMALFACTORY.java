public class ANIMALFACTORY {

    public Animal getAnimal(String action){
        if (action==null){
            return null;
        }
        if (action.equalsIgnoreCase("PERRO")){
            return new Dogs();
        } else if (action.equalsIgnoreCase("GATO")) {
            return new Cats();
        }
        return null;
    }
}
