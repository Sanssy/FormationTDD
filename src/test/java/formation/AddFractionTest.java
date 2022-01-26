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

}
