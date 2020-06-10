package com.winform.components;

public class CheckBoxComponent extends Component {
    public CheckBoxComponent(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(String.format("print CheckBox(%S)", this.name));
    }
}
