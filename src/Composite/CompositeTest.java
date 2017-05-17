package Composite;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Marcel Sailer on 11.05.2017.
 */
public class CompositeTest {
    @Test
    public void testIt(){
       Composite comp = new Composite();
       comp.add(new Composite());
       comp.add(new Leaf(45));
       comp.add(new Leaf(30));
       comp.add(new Composite());
       comp.add(new Leaf(80));
        System.out.println(comp.operation());
        List<ComponentInterface> list = new ArrayList<ComponentInterface>();
        list.add(new Leaf(123));
        list.add(new Leaf(234));
        comp.addsome(list);
        System.out.println(comp.operation());
        System.out.println(comp.getChildren());

    }

}