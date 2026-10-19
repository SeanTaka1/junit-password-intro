import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
        //arrange
        String password = "hello";
        //act
        String actual = PasswordUtils.describePasswordLength(password);
        //assert
        assertEquals("short", actual);

    }

    @Test 
    void testDescribePasswordLengthExactly12Chars() {
        // arrange
        String password = "************";
        //act
        String actual = PasswordUtils.describePasswordLength(password);
        // assert
        assertEquals("long", actual);
    }

    @Test 
    void testDescribePasswordLengthExtraLongPassword() {
        //arrange
        String password = "asdnlkasndkasndlkasndandsandklsandklsadnasndwnkandwjkndjnk";
        //act
        String actual = PasswordUtils.describePasswordLength(password);
        //assert
        assertEquals("extra long", actual);
    }

    @Test
    void testContainsTripleInMiddle() {
        //arrange
        String password = "paaasword";
        //act
        boolean actual = PasswordUtils.containsTriple(password);
        //assert
        assertEquals(true, actual);
    }

    @Test 
    void testisAlphanumeric() {
        //arrange
        String password = "He11oWor1d";
        String password1 = "He11oWor1d!!";
        //act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        boolean actual1 = PasswordUtils.isAlphanumeric(password1);
        //assert
        assertEquals(true, actual);
        assertEquals(false, actual1);
    }
}
