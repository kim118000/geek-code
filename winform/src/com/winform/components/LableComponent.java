package com.winform.components;

public class LableComponent extends Component {
    public LableComponent(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(String.format("print Lable(%S)", this.name));
    }
}
