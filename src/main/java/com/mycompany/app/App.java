package com.mycompany.app;

/**
 * Ciao Mondo !
 */
public class App
{

    private final String message = "Ciao Mondo!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
