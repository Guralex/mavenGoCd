import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Oleksandr_Gura on 8/3/2016.
 */
public class AnotherTest {

    @Test
    public void firstTest(){

        System.out.println("4 test");
        Assert.assertTrue(Main.func(5)==5);
    }

    @Test
    public void secondTest(){

        System.out.println("5 test");

        Assert.assertTrue(Main.func(5)==5);
    }

    @Test
    public void thirdTest(){

        System.out.println("6 test");

        Assert.assertTrue(Main.func(5)==5);
    }
}
