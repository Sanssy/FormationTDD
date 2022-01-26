package formation;

public class Fraction {
    private int number;
    public Fraction(int i) {
        number = i;
    }

    public Fraction add(Fraction zero) {
        if (zero.number == 0) {
            return this;
        }
        return zero;
    }
}
