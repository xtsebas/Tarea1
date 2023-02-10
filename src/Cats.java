import java.util.Random;
public class Cats implements Animal{
    @Override
    public void speak() {
        System.out.println("Meow con cara de gato");
    }

    @Override
    public void eat() {
        System.out.println("*Come sardinas*");
    }

    @Override
    public void fun() {
        System.out.println("*Se divierte*");
    }
}
