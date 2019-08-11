import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetLocalNumber() {
        int expectedLocalNumber = 14;
        Assert.assertEquals("Метод getLocalNumber возвращает неверное число.",
                expectedLocalNumber, MainClass.getLocalNumber());
    }

    @Test
    public void testGetClassNumber() {
        int expectedMinNumber = 45;
        MainClass mainClass = new MainClass();
        int testedNumber = mainClass.getClassNumber();
        Assert.assertTrue("Число " + testedNumber + " меньше " + expectedMinNumber,
                testedNumber > expectedMinNumber);
    }
}
