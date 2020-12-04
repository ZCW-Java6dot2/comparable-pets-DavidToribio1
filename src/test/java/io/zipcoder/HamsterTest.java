package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;



public class HamsterTest {
    @Test
    public void speakTest() {
        // Given

        Hamster hamster = new Hamster("");

        // When
        String expected = "squeak";

        // Then
        String actual = Hamster.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHamsterNameTest() {
        // Given
        String hamsterName = "john";
        Hamster testHamster = new Hamster(hamsterName);

        // When
        String expected = hamsterName;

        // Then
        String actual = testHamster.getName();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setHamsterNameTest() {
        // Given
         Hamster hamster = new Hamster("");

        // When
        String expected = "david";
        hamster.setName(expected);

        // Then
        String actual = hamster.getName();
        Assert.assertEquals(expected, actual);
    }
}