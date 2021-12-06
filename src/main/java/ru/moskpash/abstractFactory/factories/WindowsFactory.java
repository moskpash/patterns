package ru.moskpash.abstractFactory.factories;

import ru.moskpash.abstractFactory.elements.Button;
import ru.moskpash.abstractFactory.elements.Checkbox;
import ru.moskpash.abstractFactory.elements.windows.WindowsButton;
import ru.moskpash.abstractFactory.elements.windows.WindowsCheckbox;

public class WindowsFactory implements AbstractFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
