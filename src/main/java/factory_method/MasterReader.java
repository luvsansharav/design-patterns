package factory_method;

public class MasterReader extends Reader {
    @Override
    public ICard readCard() {
        return new MasterCard();
    }
}
