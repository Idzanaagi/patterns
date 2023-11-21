package org.example.tests.patterns.decorator;

public class Chakra extends OptionDecorator {

    public Chakra(Service service) {
        super(service, "Характеристика чакр", 500);
    }
}
