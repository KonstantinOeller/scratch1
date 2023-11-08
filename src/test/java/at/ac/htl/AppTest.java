package at.ac.htl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void when_get_sum_then_result_is_377() {
        var app = new App();
        assertEquals(385, app.getSum());
    }
}
