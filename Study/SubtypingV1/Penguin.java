package Study.SubtypingV1;

public class Penguin implements Bird {
    @Override
    public boolean flyable() {
        return false;
    }

    @Override
    public boolean swimable() {
        return true;
    }
}
