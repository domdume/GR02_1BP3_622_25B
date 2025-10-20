package epn.edu.ec.git.calculator;

import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator c;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("setUpClass()");
    }

    @Before
    public void setUp() {
        System.out.println("setUp()");
        c = new Calculator();
    }

    @Test
    public void given_two_integers_when_add_then_ok() {
        System.out.println("Test 1");
        assertEquals(6, c.addition(3, 3));
    }

    @Test
    public void given_two_integers_when_substraction_then_ok(){
        System.out.println("Test 2");
        assertEquals(7, c.subtraction(10, 3));
    }

    @Test
    public void given_two_integers_when_multiplication_then_ok(){
        System.out.println("Test NUEVO");
        assertEquals(625,c.multiplication(25, 25));
    }

    @Test(expected = ArithmeticException.class)
    public void given_two_integers_when_division_then_exception() {
        System.out.println("Test 3");
        c.division(1, 0); // Esto debería lanzar ArithmeticException
    }

    @Test(timeout = 150)
    public void given_a_time_when_timeout_then_exception() {
        System.out.println("Test 4");
        c.timeout(100);
    }

    @After
    public void tearDown() {
        System.out.println("tearDown()");
        c = null;
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("tearDownClass()");
    }
}