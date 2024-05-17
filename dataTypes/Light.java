/*
 * This program demonstrate the use of 'long' data-type
 */

package dataTypes;

class Light {
    public static void main(String args[]) {
        int lightSpeed;
        long days;
        long seconds;
        long distance;

        // approx speed of light in miles per second
        lightSpeed = 186000;

        days = 1000; // specify number of days

        seconds = days * 24 * 60 * 60; // seconds conversion

        distance = lightSpeed * seconds; // compute distance

        System.out.printf("In " + days);
        System.out.printf(" days light will travel about ");
        System.out.printf(distance + " miles");
    }
}
