import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testCountPrimesInSmallRange() {
        assertEquals(4,Main.countPrimesInRange(1,10));
    }
    @Test
    void testSumPrimesInSmallRange() {
        assertEquals(17,Main.sumPrimesInRange(1,10));
    }

    @Test
    void testCountPrimesInLargeRange () {
        assertEquals(168,Main.countPrimesInRange(1,1000));
    }

    @Test
    void testSumPrimesInLargeRange () {
        assertEquals(76127,Main.sumPrimesInRange(1,1000));
    }

    @Test
    void testCountPrimesInEmptyRange () {
        assertEquals(0,Main.countPrimesInRange(14,16));
    }

    @Test
    void testSumPrimesInEmptyRange() {
        assertEquals(0,Main.sumPrimesInRange(14,16));
    }

    @Test
    void testCountWithSinglePrime () {
        assertEquals(1, Main.countPrimesInRange(11,11));
    }

    @Test
    void testSumWithSinglePrime () {
        assertEquals(11,Main.sumPrimesInRange(11,11));
    }
}