package Model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by DAVID on 22/06/2017.
 */
public class DomoticModelTest {
/*    @Before
    public void setUp() throws Exception {

    }*/

    @Test
    public void obtenerTempSensor() {
        DomoticModel model = new DomoticModel();

        assertTrue(model.getTemperaturaSensor() > -30);
        assertTrue(model.getTemperaturaSensor() <80);
    }

   // public void

}
/*

@After
public void tearDown() throws Exception {
}

*/

