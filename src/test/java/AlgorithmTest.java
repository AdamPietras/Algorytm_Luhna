import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AlgorithmTest {

    private Algorithm algorithm;

    @Before
    public void setUp() {
        algorithm = new Algorithm();
    }

    @Test
    public void doesTestReturnFalsefNumberIsIncorrect() {
        assertFalse(algorithm.luhnAlgorithm("92480"));
    }

    @Test
    public void doesTestMethodReturnTrueIfNumberIsCorrect() {
        assertTrue(algorithm.luhnAlgorithm("5531006517734657"));
    }
}
