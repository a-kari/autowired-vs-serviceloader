package app.services;

import com.google.auto.service.AutoService;

// A realization of SimplePrinter.
// Register it in ServiceLoader via @AutoService annotation.
@AutoService(SimplePrinter.class)
public class SimplePrinterUppercaseImpl implements SimplePrinter {

    @Override
    public void print(String text) {
        System.out.println(text.toUpperCase());
    }
}
