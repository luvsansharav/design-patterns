package factory_method;

public class VisaReader extends Reader {
    @Override
    public ICard readCard() {
        return new VisaCard();
    }
}