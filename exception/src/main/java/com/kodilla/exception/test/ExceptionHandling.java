package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args){
        SecondChallenge secondChallenge = new SecondChallenge();

        try{
            secondChallenge.probablyIWillThrowException(3, 3);
        } catch (Exception e) {
            System.out.println("Error occurred while handling second challenge! Error: " + e);
        } finally {
            System.out.println("Exiting second challenge!");
        }
    }
}
