

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CalculationsTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CalculationsTest
{
    /**
     * Default constructor for test class CalculationsTest
     */
    public CalculationsTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testRemoveRowCol()
    {
        int[][] matrix1 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        Matrix m1 = new Matrix(matrix1);
        m1.show();
        Calculations c1 = new Calculations();

        Matrix m2 = c1.removeRowCol(m1,1,1);
        m2.show();
    }
}
