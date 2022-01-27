package formation;

public class Fraction {

    private final int numerator;
    private final int denominator;
    public Fraction(int i) {
        numerator = i;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction fraction) {
        if (this.denominator != fraction.denominator) {
            int numerator = this.numerator * fraction.denominator + fraction.numerator * this.denominator;
            int denominator = this.denominator * fraction.denominator;
            return new Fraction(numerator, denominator);
        }
        return new Fraction(this.numerator + fraction.numerator, this.denominator);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fraction fraction)) return false;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }
}
