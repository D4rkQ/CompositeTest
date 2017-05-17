package Composite;

/**
 * Created by Marcel Sailer on 11.05.2017.
 */
public class Leaf extends AbstractComponent {
    public Leaf(int value) {
        super(value);
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "value=" + value +
                ", components=" + components +
                '}';
    }
}
