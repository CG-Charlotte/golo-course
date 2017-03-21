import org.junit.Assert;
import org.junit.Test;

/*import golo.Helloworld;*/
/**
 * Created by charlotte on 21/03/17.
 */
public class GoloTest {

    @Test
    public void test(){
        Assert.assertTrue(true);
       int add =(Integer) golo.Helloworld.add(1, 2);
        Assert.assertEquals(3, add);
    }
}
