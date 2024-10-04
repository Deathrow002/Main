package test.java;

import Distance_Cal.DistanceCal;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DistanceCalTest {
    @Test
    public void testDistanceCal() throws Exception {
        DistanceCal distanceCal = new DistanceCal();
        int fuel = 5;

        // Capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        //Act
        distanceCal.Calculator(fuel);

        String expectedOutput = "61 KM\n";
        assertEquals(expectedOutput, outputStream.toString());

        // Reset the standard output
        System.setOut(System.out);
    }
}