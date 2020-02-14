package app;

import app.services.SimplePrinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class App implements CommandLineRunner {

    // Find all SimplePrinter realizations and put them into the list.
    // If no SimplePrinters will be found, the application will crash on start with
    // "No beans found" exception.
    @Autowired
    private List<SimplePrinter> printers;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String text = "Hello!";
        for (SimplePrinter printer : printers) {
            printer.print(text);
        }
    }
}
