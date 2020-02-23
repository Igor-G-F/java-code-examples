package code.examples.decorator.beverage.custom.io;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LowerCaseInputStreamTest {

    private InputStream inputStream;

    @BeforeEach
    void loadTestFileStream() {
        inputStream = getClass().getClassLoader().getResourceAsStream("test.files/bufferTest.txt");
    }

    @Test
    void read() throws IOException {
        final String EXPECTED_RESULT = "this is some test text!";

        StringBuilder result = new StringBuilder();

        try (InputStream stream = new LowerCaseInputStream(inputStream)) {
            Scanner s = new Scanner(stream);

            while (s.hasNextLine()) result.append(s.nextLine());
        }

        assertEquals(EXPECTED_RESULT, result.toString());
    }
}