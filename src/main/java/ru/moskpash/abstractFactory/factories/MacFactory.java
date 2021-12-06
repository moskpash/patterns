package ru.moskpash.abstractFactory.factories;

import ru.moskpash.abstractFactory.elements.Button;
import ru.moskpash.abstractFactory.elements.Checkbox;
import ru.moskpash.abstractFactory.elements.mac.MacButton;
import ru.moskpash.abstractFactory.elements.mac.MacCheckbox;

public class MacFactory implements AbstractFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
