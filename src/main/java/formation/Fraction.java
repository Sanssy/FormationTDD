package formation;

import java.math.BigInteger;

public class Fraction {

    private final int numerator;
    private final int denominator;
    public Fraction(int i) {
        numerator = i;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        int gcd = getGcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;

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

    public Fraction simplify() {
        int gcd = getGcd(numerator, denominator);

        return new Fraction(this.numerator / gcd, this.denominator / gcd);
    }

    private int getGcd(int numerator, int denominator) {
        BigInteger bNumerator = new BigInteger(String.valueOf(numerator));
        BigInteger bDenominator = new BigInteger(String.valueOf(denominator));
        int gcd = bNumerator.gcd(bDenominator).intValue();
        return gcd;
    }
}
