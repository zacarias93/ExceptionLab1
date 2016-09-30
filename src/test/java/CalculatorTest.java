import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {

    @Test
    public void addTest() {
        int expected = 10;
        int actual = Calculator.add(5,5);
        Assert.assertEquals("add 5+5", expected,actual);
    }

    @Test
    public void subtractTest() {
        int expected = 10;
        int actual = Calculator.subtract(20,10);
        Assert.assertEquals("sub 20-10", expected,actual);
    }

    @Test
    public void divideTest() throws DivisionByZeroException {
        int expected = 10;
        int actual = Calculator.divide(100,10);
        Assert.assertEquals("div 100/10", expected,actual);
    }

    @Test(expected = DivisionByZeroException.class)
    public void divideTest2() throws DivisionByZeroException {
        Calculator.divide(100,0);
    }

    @Test
    public void multiplyTest() {
        int expected = 10;
        int actual = Calculator.multiply(5,2);
        Assert.assertEquals("multiply 5*2", expected,actual);
    }



}
