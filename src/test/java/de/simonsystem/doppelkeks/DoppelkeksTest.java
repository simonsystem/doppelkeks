/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package de.simonsystem.doppelkeks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DoppelkeksTest {
    @Test public void testAppCanConvertIntegerToString() {
        assertEquals("ABCD", Doppelkeks.convertIntegerToString(0xABCD, "0123456789ABCDEF"), "app should convert integer to string");
    }
    @Test public void testAppCanConvertStringToInteger() {
        assertEquals(1234, Doppelkeks.convertStringToInteger("1234", "0123456789"), "app should convert string to integer");
    }
}
