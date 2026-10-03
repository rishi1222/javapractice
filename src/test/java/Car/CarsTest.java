package Car;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class CarsTest {

    @Before
    public void  before(){
        Cars car = new Cars("maruti","suzuki","01/01/2981");
        Cars car1 = new Cars("maruti","alto","01/04/2981");
        Cars car2 = new Cars("maruti","panda","01/04/2981");

    }

    @Test
    public void initializeCars(){

        Assert.assertEquals(3,Cars.getTotalCarsByCompanyName("maruti"));

    }


}
