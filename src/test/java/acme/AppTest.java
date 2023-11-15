package acme;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void shouldSuggestSame(){
        assertEquals( App.suggest("name"), App.suggest("name") );
    }

    @Test
    public void shouldNotSuggestSame(){
        assertNotEquals( App.suggest("name"), App.suggest("name2") );
    }
}
