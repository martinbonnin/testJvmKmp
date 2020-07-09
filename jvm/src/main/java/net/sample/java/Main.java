package net.sample.java;


import net.sample.mpp.MppException;

public class Main {
    static void main() {
        try {
            System.out.println("Hello Mpp");
        } catch (MppException e) {
            // MppException should be underlined above
            System.out.println("Oops");
        }
    }
}
