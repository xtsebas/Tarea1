public class Dogs implements Animal{
    @Override
    public void speak() {
        System.out.println("*Guau*");
        System.out.println("Sus");
        System.out.println("Cambios");
    }

    @Override
    public void eat() {
        System.out.println("*Come sus croquetas.*");
        System.out.println("*Se atraganta.*");
    }

    @Override
    public void fun() {
        System.out.println("*Se pone en 4*");
    }

}
