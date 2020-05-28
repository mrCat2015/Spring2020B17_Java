package day44_Exceptions;
/*
Write a method called "wait" that causes the current executing thread to sleep for the specific number of seconds
parameters: double seconds
 */

public class WarmUpTesk {
    public static void wait(double seconds) {
        long m = (long) seconds * 1000;
        try {
            Thread.sleep(m);
        } catch (Exception e) {
        }
    }

}
