package code_coverage_4.code_coverage_4;

import static org.junit.Assert.*;
import org.junit.Test;

public class Func1Test {

    @Test
    public void T1_xNotZero_yZero() {
        int result = Func1.func1(10, 0, 100);
        assertEquals(1, result);
    }

    @Test(expected = ArithmeticException.class)
    public void T2_xZero_yNotZero_exception() {
        Func1.func1(0, 10, 100);
    }


}
