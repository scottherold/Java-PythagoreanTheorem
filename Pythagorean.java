// Java.lang is imported by default!

public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        
        // use the Math.sqrt from java.lang to calculate the Hypotenuse
        // the Math.pow method allows for the integer to be multiplied by a expontenital
        double total = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));

        return total;
    }
}