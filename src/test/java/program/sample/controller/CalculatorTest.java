package program.sample.controller;
import junit.framework.Assert;
import junit.framework.TestCase;
public class ApplicationTest extends TestCase {
    Calci cal = new Calci();

    public void testAdd() {
        Assert.assertEquals(cal.add(10, 20), 30);
    }
    public void testMultiply() {
        Assert.assertEquals(cal.mul(10, 20), 200);
    }
}
