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
        } else if (this.numerator == 0) {
            return fraction;
        } else if (this.denominator != fraction.denominator) {
            int numerator = this.numerator * fraction.denominator + fraction.numerator * this.denominator;
            int denominator = this.denominator * fraction.denominator;
            return new Fraction(numerator, denominator);
        }
        return new Fraction(this.numerator + fraction.numerator, this.denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
