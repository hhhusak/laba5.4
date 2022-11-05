import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest54 {

    @Test
    void p1TestMethod() {
        var t = Main.P1(1, 15, 1);
        t = Double.parseDouble(String.format("%.3f", t));
        assertEquals(150.297, t);
    }
}