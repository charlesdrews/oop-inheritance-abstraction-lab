/**
 * Created by charlie on 3/24/16.
 */
public class Fish implements Pet {
    private String name;

    public Fish(String name) {
        this.name = name;
    }

    @Override
    public void feed() {
        System.out.println(name + " the fish ate some fish flakes");
    }

    @Override
    public void groom() {
        System.out.println(name + "'s tank was cleaned out");
    }

    @Override
    public void playWith() {
        System.out.println(name + " swam around (fish don't really play)");
    }
}
