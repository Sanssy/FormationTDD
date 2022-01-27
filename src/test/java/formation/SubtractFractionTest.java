package formation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractFractionTest {

    @Test
    void should_return_8_by_45_when_subtracting_20_by_45_by_12_by_45(){
        Fraction twentyByFortyFive = new Fraction(20,45);
        Fraction twelveByFortyFive = new Fraction(12,45);

        Fraction result = twentyByFortyFive.subtract(twelveByFortyFive);

        Fraction expectedResult = new Fraction(8, 45);

        assertEquals(expectedResult, result);

    }

}
