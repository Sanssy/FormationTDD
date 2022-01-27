package formation;

public class Fraction {

    private int numerator;
    private int denominator;
    public Fraction(int i) {
        numerator = i;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction fraction) {
        if (fraction.numerator == 0) {
            return this;
        } else if (numerator == 0) {
            return fraction;
        }
        if (denominator == 2) {
            return new Fraction(this.numerator + fraction.numerator, 2);
        }
        return new Fraction(this.numerator + fraction.numerator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
