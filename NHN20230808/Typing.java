package NHN20230808;

public class Typing{
    public static void canFly(Animal x) {
        System.out.println( x.type() + (x.flyable() ? "는(은) 날 수 있어.": "는(은) 못 날아.") );
    }

    public static void canSwim(Animal x) {
        System.out.println( x.type() + (x.swimable() ? "는(은) 헤엄칠 수 있어." : "는(은) 헤엄칠 수 없어."));
    }

    public static void main(String[] args) {
        Typing.canFly(new 박쥐());
        Typing.canFly(new 참새());
        Typing.canFly(new 펭귄());

        System.out.println();

        Typing.canSwim(new 박쥐());
        Typing.canSwim(new 참새());
        Typing.canSwim(new 펭귄());
    }
}