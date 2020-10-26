package org.ivasik;

import org.junit.Assert;

import org.junit.Test;

/**
 * Unit tests for Sorter class.
 */
public class SorterTest {

    @Test
    public void Test_Integer()
    {
        Integer[] actuals = {4, 6, 77, 1, -5};
        Integer[] expecteds = {-5, 1, 4, 6, 77};
        Sorter.Sort(actuals, 0, actuals.length );
        Assert.assertArrayEquals( actuals, expecteds );
    }
    @Test
    public void Test_Double()
    {
        Double[] actuals = {4.0, 6.0, 77.0, 1.0, -5.0};
        Double[] expecteds = {-5.0, 1.0, 4.0, 6.0, 77.0};
        Sorter.Sort(actuals, 0, actuals.length );
        Assert.assertArrayEquals( actuals, expecteds );
    }
    @Test
    public void Test_String()
    {
        String[] actuals = {"Elderberry", "Apple","Cantaloupe", "Banana", "Dragon Fruit", };
        String[] expecteds = {"Apple", "Banana", "Cantaloupe", "Dragon Fruit", "Elderberry"};
        Sorter.Sort(actuals, 0, actuals.length );
        Assert.assertArrayEquals( actuals, expecteds );
    }
    @Test
    public void Test_0()
    {
        Integer[] actuals = {};
        Sorter.Sort(actuals, 0, actuals.length );
        Assert.assertTrue( actuals.length == 0 );
    }
    @Test
    public void Test_1()
    {
        Integer[] actuals = {4};
        Integer[] expecteds = {4};
        Sorter.Sort(actuals, 0, actuals.length );
        Assert.assertArrayEquals( actuals, expecteds );
    }
    @Test(expected = NullPointerException.class)
    public void Test_2()
    {
        Integer[] actuals = null;
        Sorter.Sort(actuals, 0, actuals.length );
    }
    @Test(expected = IllegalArgumentException.class)
    public void Test_3()
    {
        Integer[] actuals = {4, 6, 77, 1, -5};
        Sorter.Sort(actuals, 0, -1 );
    }
}
