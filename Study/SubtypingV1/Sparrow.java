package Study.SubtypingV1;

public class Sparrow implements Bird {
    @Override
    public boolean flyable() {
        return true;
    }

    @Override
    public boolean swimable() {
        return false;
    }
}
