package formation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddFractionTest {

    @Test
    void should_return_zero_when_zero_plus_zero() {
        Fraction zero = new Fraction(0);

        Fraction sumOfZero = zero.add(zero);

        assertEquals(zero, sumOfZero);
    }
    @Test
    void should_return_one_when_zero_plus_one() {
        Fraction zero = new Fraction(0);
        Fraction one = new Fraction(1);

        Fraction result = zero.add(one);

        assertEquals(one, result);
    }
    @Test
    void should_return_one_when_one_plus_zero() {
        Fraction zero = new Fraction(0);
        Fraction one = new Fraction(1);

        Fraction result = one.add(zero);

        assertEquals(one, result);
    }

}
