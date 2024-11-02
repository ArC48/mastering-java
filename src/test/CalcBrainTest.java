package test;

import static org.junit.Assert.*;

import calc.CalcBrain;
import calc.DisplayChangedInterface;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcBrainTest {
    private CalcBrain brain;

    @Before
    public void init(){
        brain = new CalcBrain();
    }

    @Test
    public void test() {
        brain.pushDigit('1');
        brain.pushDigit('2');
        brain.pushDigit('3');
        assertEquals("123", brain.getDisplay());
    }

    @Test
    public void test2() {
        assertEquals("0", brain.getDisplay());
    }

    @Test
    public void test3() {
        brain.pushDigit('0');
        brain.pushDigit('0');
        brain.pushDigit('0');
        brain.pushDigit('1');
        brain.pushDigit('0');
        assertEquals("10", brain.getDisplay());
    }
}
