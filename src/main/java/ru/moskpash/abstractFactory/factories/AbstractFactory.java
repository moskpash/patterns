package ru.moskpash.abstractFactory.factories;

import ru.moskpash.abstractFactory.elements.Button;
import ru.moskpash.abstractFactory.elements.Checkbox;

public interface AbstractFactory {
    Button createButton();

    Checkbox createCheckbox();
}
