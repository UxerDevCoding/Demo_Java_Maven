package com.hevia;

import JavaFundamentals.PrimitiveType;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        PrimitiveType.dataType();

        PrimitiveType shortNumber = new PrimitiveType();
        shortNumber.printShortType();
        
        int shortNumberTwo = 10;
        shortNumber.printShortType();
        System.out.println(shortNumberTwo);
        
    }
}
