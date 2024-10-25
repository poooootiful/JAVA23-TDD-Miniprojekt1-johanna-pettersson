import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {
    @Test
    void testIsPrimeSmallPrime () {
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(3));
        assertTrue(Prime.isPrime(5));
        assertTrue(Prime.isPrime(7));
    }
    @Test
    void testIsPrimeNotSmallPrime () {
        assertFalse(Prime.isPrime(4));
        assertFalse(Prime.isPrime(6));
        assertFalse(Prime.isPrime(8));
        assertFalse(Prime.isPrime(9));
    }

    @Test
    void testIsPrimeLargerPrime () {
        assertTrue(Prime.isPrime(11));
        assertTrue(Prime.isPrime(13));
        assertTrue(Prime.isPrime(13));
        assertTrue(Prime.isPrime(19));
        assertTrue(Prime.isPrime(997));
    }

    @Test
    void testIsPrimeLargeNonPrime () {
        assertFalse(Prime.isPrime(1000));
    }

}