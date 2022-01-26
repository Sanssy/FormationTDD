package formation;

public class Fraction {
    private int number;
    public Fraction(int i) {
        number = i;
    }

    public Fraction add(Fraction fraction) {
        if (fraction.number == 0) {
            return this;
        } else if (number == 0) {
            return fraction;
        }
        return new Fraction(this.number + fraction.number);
    }

    public int getNumber() {
        return number;
    }
}
