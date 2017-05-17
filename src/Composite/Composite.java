package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcel Sailer on 11.05.2017.
 */
public class Composite extends AbstractComponent {
    @Override
    public String toString() {
        return "Composite{" +
                "value=" + value +
                ", components=" + components +
                '}';
    }

    @Override
    public int operation() {
        int tmp= 0;
        for (ComponentInterface x : components) {
            tmp+=x.operation();
        }
        return tmp;
    }

    public void addsome(List<ComponentInterface> list){
        components.addAll(list);
    }

    public void add(ComponentInterface comp){
        components.add(comp);
    }
    public void remove(ComponentInterface comp) {
        components.remove(comp);
    }
    public ComponentInterface getChild(int index){
        return components.get(index);
    }
}
