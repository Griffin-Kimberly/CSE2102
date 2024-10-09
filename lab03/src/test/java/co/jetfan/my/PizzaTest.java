package co.jetfan.my;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PizzaTest extends TestCase{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PizzaTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PizzaTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testPizza()
    {
        PizzaFactory oven = new PizzaFactory();
        Pizza chpizza = oven.MakePizza("CHEESE");
        chpizza.prepare();
        chpizza.bake();
        chpizza.cut();
        chpizza.box();
        
    }
}
