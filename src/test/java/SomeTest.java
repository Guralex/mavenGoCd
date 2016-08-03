import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Oleksandr_Gura on 8/3/2016.
 */
public class SomeTest {

    @Test
    public void firstTest(){

        System.out.println("First test");
        Assert.assertTrue(Main.func(5)==5);
    }

    @Test
    public void secondTest(){

        System.out.println("Second test");

        Assert.assertTrue(Main.func(5)==5);
    }

    @Test
    public void thirdTest(){

        System.out.println("Third test");

        Assert.assertTrue(Main.func(5)==5);
    }
}
