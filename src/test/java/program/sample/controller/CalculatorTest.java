package program.sample.controller;
import junit.framework.Assert;
import junit.framework.TestCase;
public class CalculatorTest extends TestCase {
    Calci cal = new Calci();

    public void testAdd() {
        Assert.assertEquals(cal.add(5, 15), 20);
    }
    public void testMultiply() {
        Assert.assertEquals(cal.mul(30, 20), 500);
    }
}
