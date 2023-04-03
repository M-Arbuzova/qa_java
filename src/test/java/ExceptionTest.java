import com.example.Animal;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExceptionTest {
    Feline feline;
    Animal animal = new Animal();
    private String sex;
    private final String expectedExceptionAboutFood = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
    private final String expectedExceptionAboutSex = "Используйте допустимые значения пола животного - самец или самка";

    @Test
    public void getFoodInvalidAnimalKind() throws Exception {
        try {
            animal.getFood("Насекомое");
            Assert.fail("Expected Exception");
        } catch (Exception exception) {
            System.out.println(exception);
            assertEquals(expectedExceptionAboutFood, exception.getMessage());
        }
    }

    @Test
    public void setInvalidSexLion() throws Exception {
        try {
            Lion lion = new Lion("Неизвестно", feline);
            Assert.fail("Expected Exception");
        } catch (Exception exception) {
            System.out.println(exception);
            assertEquals(expectedExceptionAboutSex, exception.getMessage());
        }
    }
}

