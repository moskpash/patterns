package ru.moskpash.decorator.decoration;

import ru.moskpash.decorator.component.Component;

public class FirstDecorator extends BaseDecorator implements Component {
    public FirstDecorator(Component wrapped) {
        super(wrapped);
    }

    @Override
    public String execute() {
        return super.execute() + " в первой оболочке";
    }
}
