import java.util.Random;
public class Cats implements Animal{
    @Override
    public void speak() {
        System.out.println("Meow");
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
