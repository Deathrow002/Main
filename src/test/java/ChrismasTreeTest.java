package test.java;

import Christmas_Tree.ChrismasTree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class ChrismasTreeTest {

    @Test
    public void testCreateTree4() throws Exception {
        ChrismasTree tree = new ChrismasTree();
        int wide = 4; // test a tree with width 4

        // Capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Act
        tree.createTree(wide);

        // Assert
        String expectedOutput =
                "      \n" +
                "    * \n" +
                        "  * * * \n" +
                        "* * * * * \n" +
                        "    * \n" +
                        "  * * * \n"; // Expected output for width 4

        assertEquals(expectedOutput, outputStream.toString());

        // Reset the standard output
        System.setOut(System.out);
    }

    @Test
    public void testCreateTree5() throws Exception {
        ChrismasTree tree = new ChrismasTree();
        int wide = 5; // test a tree with width 5

        // Capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Act
        tree.createTree(wide);

        // Assert
        String expectedOutput =
                "        \n" +
                "      * \n" +
                        "    * * * \n" +
                        "  * * * * * \n" +
                        "* * * * * * * \n" +
                        "      * \n" +
                        "    * * * \n"; // Expected output for width 5

        assertEquals(expectedOutput, outputStream.toString());

        // Reset the standard output
        System.setOut(System.out);
    }

    @Test
    public void testCreateTree6() throws Exception {
        ChrismasTree tree = new ChrismasTree();
        int wide = 6; // test a tree with width 6

        // Capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Act
        tree.createTree(wide);

        // Assert
        String expectedOutput =
                "          \n" +
                "        * \n" +
                        "      * * * \n" +
                        "    * * * * * \n" +
                        "  * * * * * * * \n" +
                        "* * * * * * * * * \n" +
                        "        * \n" +
                        "      * * * \n"; // Expected output for width 6

        assertEquals(expectedOutput, outputStream.toString());

        // Reset the standard output
        System.setOut(System.out);
    }

    @Test
    public void testException() {
        // Arrange
        ChrismasTree tree = new ChrismasTree();
        int wide = 3; // invalid width (less than 4)

        // Act & Assert
        Exception exception = assertThrows(Exception.class, () -> {
            tree.createTree(wide);
        });

        // Assert that the exception message is correct
        assertEquals("Input must be at least 4.", exception.getMessage());
    }
}