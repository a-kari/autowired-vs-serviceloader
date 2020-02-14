package app;

import app.services.SimplePrinter;

import java.util.ServiceLoader;

public class App {

    // Find all registered SimplePrinter realizations via ServiceLoader.
    public static void main(String[] args) {
        final ServiceLoader<SimplePrinter> printers = ServiceLoader.load(SimplePrinter.class);
        for (SimplePrinter printer : printers) {
            printer.print("Hello!");
        }
    }
}
