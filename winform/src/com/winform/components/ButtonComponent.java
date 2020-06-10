package com.winform.components;

public class ButtonComponent extends Component {
    public ButtonComponent(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(String.format("print Button(%S)", this.name));
    }
}
