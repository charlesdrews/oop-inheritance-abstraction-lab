/**
 * Created by charlie on 3/24/16.
 */
public class Cat implements Pet {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void feed() {
        System.out.println(name + " the cat ate some wet food");
    }

    @Override
    public void groom() {
        System.out.println(name + " the cat got a good brushing");
    }

    @Override
    public void playWith() {
        System.out.println(name + " the cat batted around a ball of yarn");
    }
}
