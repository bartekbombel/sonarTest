import jasper.JasperDisplay;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class testClass {

    JasperDisplay jasper = new JasperDisplay();

    @Test
    public void test(){
        jasper.createToken();
        assertTrue(jasper.token != null);
    }

}
