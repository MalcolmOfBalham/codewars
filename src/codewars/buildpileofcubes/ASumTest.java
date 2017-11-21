package codewars.buildpileofcubes;

import static org.junit.Assert.*;

import org.junit.Test;

public class ASumTest {

    @Test
    public void testCalcVolume() {
        assertEquals(1071225, (long)ASum.calcVolume(45));
        assertEquals(2304422822859502500L, (long)ASum.calcVolume(55100));
    }

    @Test
    public void test1() throws Exception {
        assertEquals(2022, ASum.findNb(4183059834009L));
    }

     @Test
     public void test2() {
     assertEquals(-1, ASum.findNb(24723578342962L));
     }

    @Test
    public void test3() throws Exception {
        // initial timing 1.5seconds for this

        assertEquals(4824, ASum.findNb(135440716410000L));
    }

    @Test
    public void test4() throws Exception {
        assertEquals(3568, ASum.findNb(40539911473216L));
    }

    @Test
    public void test5() {
        assertEquals(-1, ASum.findNb(1789611650149505626L));
    }
    
    @Test
    public void test6() {
        assertEquals(55100, ASum.findNb(2304422822859502500L));
    }

    @Test
    public void testGetNextIncement() throws Exception {
        assertEquals(100, ASum.getNextIncrement(1000, 900, 100));
        assertEquals(-50, ASum.getNextIncrement(1000, 1100, 100));
        assertEquals(25, ASum.getNextIncrement(1000, 900, -50));

    }

}
