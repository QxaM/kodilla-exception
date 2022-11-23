package com.kodilla.exception.test;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallengeTestSuite {

    @Nested
    class XInputTests{

        @Test
        void testXMoreThan2(){
            //Given
            SecondChallenge secondChallenge = new SecondChallenge();

            //When & Then
            assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(3, 0));
        }

        @Test
        void testXEquals2(){
            //Given
            SecondChallenge secondChallenge = new SecondChallenge();

            //When & Then
            assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 0));
        }

        @Test
        void testXEquals1(){
            //Given
            SecondChallenge secondChallenge = new SecondChallenge();

            //When & Then
            assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 0));
        }

        @Test
        void testXLessThan1(){
            //Given
            SecondChallenge secondChallenge = new SecondChallenge();

            //When & Then
            assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0, 0));
        }
    }

    @Nested
    class YInputTests{

        @Test
        void testYDifferentThan1AndAHalf(){
            //Given
            SecondChallenge secondChallenge = new SecondChallenge();

            //When & Then
            assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 2));
        }

        @Test
        void testYEquals1AndAHalf(){
            //Given
            SecondChallenge secondChallenge = new SecondChallenge();

            //When & Then
            assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1, 1.5));
        }
    }
}
