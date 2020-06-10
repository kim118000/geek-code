package com.winform.components;

import java.util.ArrayList;
import java.util.List;

public abstract class Container extends Component {
    private List<Component> childComponent;

    public Container(String name) {
        super(name);
        this.childComponent = new ArrayList<>();
    }

    public void addComponent(Component component) {
        this.childComponent.add(component);
    }

    @Override
    public void print() {
        for (Component component : this.childComponent) {
            component.print();
        }
    }
}
