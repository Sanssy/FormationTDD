package Fraction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddFractionTest {

    @Test
    void should_return_zero_when_adding_two_fractions() {
        Fraction fraction = new Fraction();

        assertEquals(0, fraction.add(fraction));
    }

}
