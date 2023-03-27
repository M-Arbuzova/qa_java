import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    private final int expectedKittenCount = 1;
    private final List<String> expectedFoodFeline = List.of("Животные", "Птицы", "Рыба");

    @Test
    public void eatMeatFelineTest() throws Exception {
        Feline feline = new Feline();
        assertEquals(expectedFoodFeline, feline.eatMeat());
    }

    @Test
    public void getFamilyFelineTest() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensFelineTest() {
        Feline feline = new Feline();
        assertEquals(expectedKittenCount, feline.getKittens());
    }

    @Test
    public void getKittensFelineTest2() {
        Feline feline = new Feline();
        assertEquals(5, feline.getKittens(5));

    }
}