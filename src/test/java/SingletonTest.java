import org.junit.jupiter.api.Test;
import singleton.Singleton;

public class SingletonTest {

    @Test
    public void testSingleThread() {
        Singleton instance1 = Singleton.getInstance("A");
        Singleton instance2 = Singleton.getInstance("B");

        assert instance1.equals(instance2);
    }

}
