package com.winform.components;

public class TextBoxComponent extends Component {
    public TextBoxComponent(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(String.format("print TextBox(%S)", this.name));
    }
}
