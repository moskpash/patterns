package ru.moskpash.decorator.decoration;

import ru.moskpash.decorator.component.Component;

public class SecondDecorator extends BaseDecorator implements Component {
    public SecondDecorator(Component wrapped) {
        super(wrapped);
    }

    @Override
    public String execute() {
        return super.execute() + " во второй оболочке";
    }
}
