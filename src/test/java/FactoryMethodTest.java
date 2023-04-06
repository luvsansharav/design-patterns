import factory_method.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactoryMethodTest {

    @Test
    public void testVisa() throws Exception {
        Client client = new Client();
        Reader reader = client.scan("visa");

        assert reader instanceof VisaReader;
    }

    @Test
    public void testMaster() throws Exception {
        Client client = new Client();
        Reader reader = client.scan("master");

        assert reader instanceof MasterReader;
    }

    @Test
    public void testDefault() {
        Client client = new Client();
        Assertions.assertThrows(Exception.class, () -> {
            Reader reader = client.scan("discover");
            reader.start();
        });
    }

    @Test
    public void testVisaReader() {
        Reader reader = new VisaReader();
        Assertions.assertEquals("success", reader.start());
    }

    @Test
    public void testMasterReader() {
        Reader reader = new MasterReader();
        Assertions.assertEquals("success", reader.start());
    }

}
