package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcel Sailer on 11.05.2017.
 */
public abstract class AbstractComponent implements ComponentInterface{

    protected int value;
    protected final List<ComponentInterface> components = new ArrayList<>();

    public AbstractComponent() {
    }

    public AbstractComponent(int value) {
        this.value = value;
    }

    public List<ComponentInterface> getChildren() {
        return components;
    }

    @Override
    public int operation(){
        return value;
    }





}
