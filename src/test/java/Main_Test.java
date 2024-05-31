import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Main_Test {
    @Test
    public void test_00() {
        Main main = new Main();
        assertEquals(main.one(), 1);
    }
}
