package app.services;

import org.springframework.stereotype.Component;

// A realization of SimplePrinter,
// which we have registered in Spring context by @Component annotation.
@Component
public class SimplePrinterUppercaseImpl implements SimplePrinter {

    @Override
    public void print(String text) {
        System.out.println(text.toUpperCase());
    }
}
