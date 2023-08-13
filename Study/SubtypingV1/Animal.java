package Study.SubtypingV1;

public interface Animal {

    default String type() {
        return this.getClass().getSimpleName();
    }

    boolean flyable();

    boolean swimable();


}
