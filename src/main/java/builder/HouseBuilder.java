package builder;

public class HouseBuilder implements Builder {
    private String paint;
    private String siding;
    private boolean kitchenReModel;
    private boolean bathroomReModel;

    @Override
    public void paint(String color) {
        this.paint = color;
    }

    @Override
    public void siding(String material) {
        this.siding = material;
    }

    @Override
    public void kitchenReModel() {
        this.kitchenReModel = true;
    }

    @Override
    public void bathroomReModel() {
        this.bathroomReModel = true;
    }

    public String getResult() {
        return "Result: " + this.paint
                + " - " + this.bathroomReModel
                + " -  " + this.kitchenReModel
                + " - " + this.siding;
    }
}
