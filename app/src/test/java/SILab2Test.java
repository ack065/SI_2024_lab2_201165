import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

class SILab2Test {

    @Test
    public void TestTrue() {
        SILab2 lab2 = new SILab2();
        Item item1 = new Item("Rozeva Banana", "0223305", 40, 0.3F);

        Item item2 = new Item("Sina Banana", "0224305", 401, 0.32F);

        Item item3 = new Item("Bela Banana", "0213305", 200, 0.15F);

        Item item4 = new Item("Kafeava Banana", "0223306", 500, 0.5F);

        List<Item> items = new ArrayList<>();

        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);

        assertFalse("No money Honney", lab2.checkCart(items, 30));

    }
    @Test
    public void TestFalse() {
        SILab2 lab2 = new SILab2();
        Item item1 = new Item("Rozeva Banana", "0223305", 40, 0.3F);

        Item item2 = new Item("Sina Banana", "0224305", 401, 0.32F);

        Item item3 = new Item("Bela Banana", "0213305", 200, 0.15F);

        Item item4 = new Item("Kafeava Banana", "0223306", 500, 0.5F);

        List<Item> items = new ArrayList<>();

        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);

        assertTrue("Wow a lot of money!", lab2.checkCart(items, 500000));

    }

}
