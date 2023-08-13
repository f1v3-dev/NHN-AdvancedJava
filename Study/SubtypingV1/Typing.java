package Study.SubtypingV1;

public class Typing {

    public static void canFly(Animal animal) {
        System.out.println(animal.type() + (animal.flyable() ? "는(은) 날 수 있어." : "는(은) 날 수 없어."));
    }

    public static void canSwim(Animal animal) {
        System.out.println(animal.type() + (animal.swimable() ? "는(은) 수영을 할 수 있어." : "는(은) 수영을 할 수 없어."));
    }

    public static void main(String[] args) {
        Typing.canFly(new Bat());
        Typing.canFly(new Penguin());
        Typing.canFly(new Sparrow());
        System.out.println();

        canSwim(new Bat());
        canSwim(new Penguin());
        canSwim(new Sparrow());
    }
}
