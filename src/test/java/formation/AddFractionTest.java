package formation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddFractionTest {

    @Test
    void should_return_0_when_0_plus_0() {
        Fraction zero = new Fraction(0);

        Fraction sumOfZero = zero.add(zero);

        assertEquals(zero, sumOfZero);
    }
    @Test
    void should_return_1_when_0_plus_1() {
        Fraction zero = new Fraction(0);
        Fraction one = new Fraction(1);

        Fraction result = zero.add(one);

        assertEquals(one, result);
    }
    @Test
    void should_return_1_when_1_plus_0() {
        Fraction zero = new Fraction(0);
        Fraction one = new Fraction(1);

        Fraction result = one.add(zero);

        assertEquals(one, result);
    }

    @Test
    void should_return_sum_of_values_when_adding_two_values_different_than_0() {
        Fraction one = new Fraction(1);

        Fraction result = one.add(one);

        Fraction expectedResult = new Fraction(2);
        assertEquals(expectedResult.getNumerator(), result.getNumerator());
    }

    @Test
    void should_return_1_by_2_when_0_plus_1_by_2() {
        Fraction zero = new Fraction(0);
        Fraction oneByTwo = new Fraction(1,2);

        Fraction result = zero.add(oneByTwo);

        Fraction expectedResult = oneByTwo;
        assertEquals(expectedResult, result);
    }

    @Test
    void should_return_2_by_1_when_1_plus_1_by_1() {
        Fraction one = new Fraction(1);
        Fraction oneByOne = new Fraction(1,1);

        Fraction result = one.add(oneByOne);

        Fraction expectedResult = new Fraction(2,1);
        assertEquals(expectedResult.getNumerator(), result.getNumerator());
        assertEquals(expectedResult.getDenominator(), result.getDenominator());
    }

}
