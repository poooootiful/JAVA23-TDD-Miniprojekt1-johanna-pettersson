import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    @DisplayName("Counts prime numbers between 1 and 10 ")
    void testCountPrimesInSmallRange() {
        assertEquals(4,Main.countPrimesInRange(1,10));
    }
    @Test
    @DisplayName("Adds together the prime numbers in range 1 to 10")
    void testSumPrimesInSmallRange() {
        assertEquals(17,Main.sumPrimesInRange(1,10));
    }

    @Test
    @DisplayName("Counts prime numbers between 1 and 1000")
    void testCountPrimesInLargeRange () {
        assertEquals(168,Main.countPrimesInRange(1,1000));
    }

    @Test
    @DisplayName("Adds together the prime numbers in range 1 to 1000")
    void testSumPrimesInLargeRange () {
        assertEquals(76127,Main.sumPrimesInRange(1,1000));
    }

    @Test
    @DisplayName("Count prime number in range where prime numbers are null")
    void testCountPrimesInEmptyRange () {
        assertEquals(0,Main.countPrimesInRange(14,16));
    }

    @Test
    @DisplayName("Add together prime in range where prime numbers are null")
    void testSumPrimesInEmptyRange() {
        assertEquals(0,Main.sumPrimesInRange(14,16));
    }

    @Test
    @DisplayName("Counts prime in range where only 1 prime exsists")
    void testCountWithSinglePrime () {
        assertEquals(1, Main.countPrimesInRange(11,11));
    }

    @Test
    @DisplayName("Add together prime in range where only 1 prime exsists")
    void testSumWithSinglePrime () {
        assertEquals(11,Main.sumPrimesInRange(11,11));
    }
}