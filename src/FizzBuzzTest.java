import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testeAusgabe(){
        Assert.assertEquals(41, FizzBuzz.zahlenAusgeben());
    }

}
