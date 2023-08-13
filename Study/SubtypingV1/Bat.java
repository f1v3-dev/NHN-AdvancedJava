package Study.SubtypingV1;

public class Bat implements Mammal {
    @Override
    public boolean flyable() {
        return true;
    }

    @Override
    public boolean swimable() {
        return false;
    }
}
