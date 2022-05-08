import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestMethods {

    Animal animal;

    @BeforeClass
    public void setUp() {
        animal = new Animal();
    }

    @Test
    public void verifyBarkMethod() {
        Assert.assertEquals(animal.sound(), "*Bark*");
    }

    @Test
    public void checkGetSomeNumber() {
        int number = animal.getSomeNumber(5);

        Assert.assertEquals(number, 15);
    }


}
