package formation;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimplifyFractionTest {



    @Test
    void should_return_1_by_1_after_simplification() {
        Fraction oneByOne = new Fraction(1,1);

        Fraction result = oneByOne.simplify();

        Fraction expectedResult = new Fraction(1);
        assertEquals(expectedResult, result);
    }

    @Test
    void should_return_1_by_1_after_simplification_of_5_by_5() {
        Fraction fiveByFive = new Fraction(5,5);

        Fraction result = fiveByFive.simplify();

        Fraction expectedResult = new Fraction(1,1);
        assertEquals(expectedResult, result);
    }
    @Test
    void should_return_0_by_1_after_simplification_of_0_by_2() {
        Fraction zeroByTwo = new Fraction(0,2);

        Fraction result = zeroByTwo.simplify();

        Fraction expectedResult = new Fraction(0,1);
        assertEquals(expectedResult, result);
    }

    @Test
    void should_return_0_by_1_after_simplification_of_0_by_4() {
        Fraction zeroByTwo = new Fraction(0,2);

        Fraction result = zeroByTwo.simplify();

        Fraction expectedResult = new Fraction(0,1);
        assertEquals(expectedResult, result);
    }

    @Test
    void should_return_5_by_3_after_simplification() {
        Fraction fortyByTwentyFour = new Fraction(40,24);

        Fraction result = fortyByTwentyFour.simplify();

        Fraction expectedResult = new Fraction(5,3);
        assertEquals(expectedResult, result);
    }
}
