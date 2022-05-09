import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestDogClass {

    Dog dog;

    @BeforeClass
    public void setUp() {
        dog = new Dog();
    }

    @Test
    public void verifyBreed() {
        Assert.assertEquals(dog.getBreed(), "Airedale Terrier");
    }

    @Test
    public void verifyBarkMethod() {
        Assert.assertEquals(dog.bark(), "*Bark*");
    }
}
