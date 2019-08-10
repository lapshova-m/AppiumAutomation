import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetLocalNumber() {
        int expectedLocalNumber = 14;
        Assert.assertEquals("Метод getLocalNumber возвращает неверное число.",
                expectedLocalNumber, MainClass.getLocalNumber());
    }

}
