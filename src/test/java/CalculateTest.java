import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by dmitry.arefyev on 04.10.2016.
 */
public class CalculateTest {
    @Test
    public void testCalA() throws Exception {
        Calculate calculate = new Calculate();
        int n = calculate.calA(2, 2);

        assertEquals(4, n);
    }
}
