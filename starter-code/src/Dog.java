/**
 * Created by charlie on 3/24/16.
 */
public class Dog implements Pet {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void feed() {
        System.out.println(name + " the dog ate some kibble");
    }

    @Override
    public void groom() {
        System.out.println(name + " the dog got a good brushing");
    }

    @Override
    public void playWith() {
        System.out.println(name + " played fetch");
    }
}
