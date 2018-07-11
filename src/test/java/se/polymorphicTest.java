package se;

import org.junit.Test;
import se.polymorphic.RemoveDuplicate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Calvin on 2018/6/8
 */
public class polymorphicTest {

    @Test
    public void removeDuplicateTest(){
        final List<RemoveDuplicate> removeDuplicates = new ArrayList<RemoveDuplicate>();
        RemoveDuplicate r = new RemoveDuplicate();
        r.setIdCard("441323199412141016");
        r.setName("罗建广");
        removeDuplicates.add(r);

        RemoveDuplicate r1 = new RemoveDuplicate();
        r1.setIdCard("441323199412141016");
        r1.setName("罗建广");
        removeDuplicates.add(r1);

        removeDuplicates.stream().forEach(
                p -> {
                    if(!removeDuplicates.contains(p)){
                        removeDuplicates.add(p);
                    }
        });

        System.out.println(removeDuplicates);
    }
}
