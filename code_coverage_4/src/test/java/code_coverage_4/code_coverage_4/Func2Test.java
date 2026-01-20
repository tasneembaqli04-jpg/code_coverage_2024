package code_coverage_4.code_coverage_4;

import static org.junit.Assert.*;
import org.junit.Test;

public class Func2Test {

    @Test
    public void T1_pNotZero() {
        String result = Func2.func2(0.2f, 1.2f);
        assertEquals("p=10.20, q=0.12", result);
    }

    @Test
    public void T2_pZero() {
        String result = Func2.func2(0.0f, 1.2f);
        assertEquals("p=0.00, q=Infinity", result);
    }
}

