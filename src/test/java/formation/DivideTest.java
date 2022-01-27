package formation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DivideTest {

    @Test
    void should_return_8_by_45_when_dividing_6_by_9_divide_by_15_by_4(){
        Fraction sixByNine = new Fraction(6,9);
        Fraction fifteenByFour = new Fraction(15,4);

        Fraction result = sixByNine.divide(fifteenByFour);

        Fraction expectedResult = new Fraction(8, 45);

        assertEquals(expectedResult, result);

    }

}
