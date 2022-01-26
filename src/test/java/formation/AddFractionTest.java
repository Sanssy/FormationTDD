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
    void should_return_value_different_than_zero_when_zero_plus_value_different_than_zero() {
        Fraction zero = new Fraction(0);
        Fraction one = new Fraction(1);

        Fraction result = zero.add(one);

        assertEquals(one, result);
    }
    @Test
    void should_return_value_different_than_zero_when_value_different_than_zero_plus_zero() {
        Fraction zero = new Fraction(0);
        Fraction one = new Fraction(1);

        Fraction result = one.add(zero);

        assertEquals(one, result);
    }

    @Test
    void should_return_sum_of_values_when_adding_two_values_different_than_zero() {
        Fraction one = new Fraction(1);

        Fraction result = one.add(one);

        Fraction expectedResult = new Fraction(2);
        assertEquals(expectedResult.getNumber(), result.getNumber());
    }

}
