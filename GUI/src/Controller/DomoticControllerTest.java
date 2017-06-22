package Controller;

import Model.DomoticModel;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by DAVID on 22/06/2017.
 */
public class DomoticControllerTest {

    @Test
    public void temperaturaSanitizada(){

        DomoticModel model=new DomoticModel();
        DomoticController controlador= new DomoticController(model);
        int T=0;
        assertTrue(controlador.sanitizarTemperatura(T));

    }

}