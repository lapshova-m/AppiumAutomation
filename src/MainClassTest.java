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

    @Test
    public void testGetClassString() {
        String expectedPartString1 = "hello";
        String expectedPartString2 = "Hello";
        MainClass mainClass = new MainClass();
        String testedString = mainClass.getClassString();
        Assert.assertTrue("В строке " + testedString + " нет подстрок " + expectedPartString1 +
                " или " + expectedPartString2,
                testedString.contains(expectedPartString1) || testedString.contains(expectedPartString2));
    }
}
