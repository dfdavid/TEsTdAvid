package Controller;

import Model.DomoticModel;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by DAVID on 22/06/2017.
 */
public class DomoticControllerTest {

    DomoticModel model=new DomoticModel();
    DomoticController controlador= new DomoticController(model);

    @Test
    public void temperaturaSanitizada(){

        int T=0;
        assertTrue(controlador.sanitizarTemperatura(T));
    }

    @Test
    public void temperaturaSanitizada2(){
        int T=-1;
        assertFalse(controlador.sanitizarTemperatura(T));
    }

}