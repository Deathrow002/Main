package test.java;

import Forex.Forex;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ForexTest {
    @Test
    public void testForexWON() {
        // Arrange
        Forex forex = new Forex();
        int amount = 100;
        String currency = "WON";

        // Capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        //Act
        forex.forex(amount, currency);

        // Assert
        String expectedOutput = "3372.0 WON\n";
        assertEquals(expectedOutput, outputStream.toString());

        // Reset the standard output
        System.setOut(System.out);
    }

    @Test
    public void testForexUSD() {
        // Arrange
        Forex forex = new Forex();
        int amount = 100;
        String currency = "USD";

        // Capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Act
        forex.forex(amount, currency);

        // Assert
        String expectedOutput = "2.8 USD\n";
        assertEquals(expectedOutput, outputStream.toString());

        // Reset the standard output
        System.setOut(System.out);
    }

    @Test
    public void testForexYEN() {
        // Arrange
        Forex forex = new Forex();
        int amount = 100;
        String currency = "YEN";

        // Capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Act
        forex.forex(amount, currency);

        // Assert
        String expectedOutput = "340.0 YEN\n";
        assertEquals(expectedOutput, outputStream.toString());

        // Reset the standard output
        System.setOut(System.out);
    }

    @Test
    public void testInvalidCurrency() {
        // Arrange
        Forex forex = new Forex();
        int amount = 100;
        String currency = "EUR";

        // Capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Act
        forex.forex(amount, currency);

        // Assert
        String expectedOutput = "Currency type not recognized\n";
        assertEquals(expectedOutput, outputStream.toString());

        // Reset the standard output
        System.setOut(System.out);
    }
}