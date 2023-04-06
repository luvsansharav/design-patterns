package factory_method;

public abstract class Reader {

    public String start() {
        System.out.println("Card reader initiated!");

        ICard card = readCard();
        return card.processPayment();
    }

    public abstract ICard readCard();
}
