package Study.SubtypingV2;

public class Typing {

    public static String type(Object thing) {
        return thing.getClass().getSimpleName();
    }

    public static void canFly(Flyable thing) {
        System.out.println(type(thing) + "는(은) 날 수 있어.");
    }

    public static void main(String[] args) {

        Flyable[] flies = {new FlyableBat(), new Airplane()};

        for (Flyable fly : flies) {
            Typing.canFly(fly);
        }
    }
}
