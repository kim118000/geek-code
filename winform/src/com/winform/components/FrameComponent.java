package com.winform.components;

public class FrameComponent extends Container {
    public FrameComponent(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(String.format("print Frame(%S)", this.name));
        super.print();
    }
}
