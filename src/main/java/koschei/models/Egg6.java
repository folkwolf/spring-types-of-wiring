package koschei.models;

public class Egg6 {

    public void setNeedle(Needle7 needle) {
        this.needle = needle;
    }

    private Needle7 needle;

    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();
    }
}
