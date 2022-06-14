import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;
    @Before
    public void before(){
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void hasVolumeOf100(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void canReduceVolumeBy10WithDrink(){
        assertEquals(90, waterbottle.drink());
    }

    @Test
    public void canReduceVolumeMultipleTimes(){
        waterbottle.drink();
        waterbottle.drink();
        assertEquals(80, waterbottle.getVolume());
    }

    @Test
    public void canEmptyBottle(){
        waterbottle.emptyBottle();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void canRefillBottle(){
        waterbottle.refillBottle();
        assertEquals(100, waterbottle.getVolume());
    }
}
