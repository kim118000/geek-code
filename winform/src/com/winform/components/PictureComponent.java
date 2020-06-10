package com.winform.components;

public class PictureComponent extends Component {
    public PictureComponent(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(String.format("print Picture(%S)", this.name));
    }
}
