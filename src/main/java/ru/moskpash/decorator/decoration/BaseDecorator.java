package ru.moskpash.decorator.decoration;

import ru.moskpash.decorator.component.Component;

public class BaseDecorator implements Component {

    Component wrapped;

    public BaseDecorator(Component wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String execute() {
        return wrapped.execute();
    }
}
