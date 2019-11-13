package code.examples.junit;

import static code.examples.junit.NumberCruncher.getLargestNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NumberCruncherTest {

    @Test
    void getLargestNumber_receivesOneInput_returnsTheInput() {
        int result = getLargestNumber(7);
        assertEquals(7, result);
    }

}