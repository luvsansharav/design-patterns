package builder;

public class Director {

    public void buildHouse(Builder builder) {
        builder.paint("Blue");
        builder.siding("wood");
        builder.kitchenReModel();
        builder.bathroomReModel();
    }

    public void fixBathroom(Builder builder) {
        builder.bathroomReModel();
        builder.paint("White");
    }

}
