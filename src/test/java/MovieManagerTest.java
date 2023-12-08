import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void test() {
        MovieManager manager = new MovieManager();

        manager.add("Bloodshot");

        String[] actual = manager.findAll();
        String[] expected = {"Bloodshot"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        MovieManager manager = new MovieManager();

        manager.add("Bloodshot");
        manager.add("Vpered");
        manager.add("Hotel Belgrad");

        String[] actual = manager.findAll();
        String[] expected = {"Bloodshot", "Vpered", "Hotel Belgrad"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        MovieManager manager = new MovieManager();

        manager.add("Bloodshot");
        manager.add("Vpered");
        manager.add("Hotel Belgrad");

        String[] actual = manager.findLast();
        String[] expected = {"Hotel Belgrad", "Vpered", "Bloodshot"};
        Assertions.assertArrayEquals(expected, actual);
    }
}

