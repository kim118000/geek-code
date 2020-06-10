package com.winform.components;

public class PasswordBoxComponent extends Component {
    public PasswordBoxComponent(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(String.format("print PasswordBox(%S)", this.name));
    }
}
