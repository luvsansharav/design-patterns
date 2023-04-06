import builder.Builder;
import builder.Director;
import builder.HouseBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuilderTest {

    @Test
    public void testBuildHouse() {
        Director director = new Director();

        HouseBuilder builder = new HouseBuilder();
        director.buildHouse(builder);

        Assertions.assertEquals("Result: Blue - true -  true - wood", builder.getResult());
    }

    @Test
    public void testFixBathroom() {
        Director director = new Director();

        HouseBuilder builder = new HouseBuilder();
        director.fixBathroom(builder);

        Assertions.assertEquals("Result: White - true -  false - null", builder.getResult());
    }
}
