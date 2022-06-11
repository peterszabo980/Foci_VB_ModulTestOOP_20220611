package Test.hu.Progmatic;

import hu.Progmatic.Prime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeTest {

    @Test
    void isPrimeTrue() {
        Assertions.assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(3));
        assertTrue(Prime.isPrime(7));
    }

    @Test
    void isPrimeFalse() {
        assertFalse(Prime.isPrime(8));
        assertFalse(Prime.isPrime(14));
        assertFalse(Prime.isPrime(1234));
    }
}
