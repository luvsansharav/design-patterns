package factory_method;

public class Client {

    public Reader scan(String provider) throws Exception {
        Reader reader;
        switch (provider) {
            case "visa" -> reader = new VisaReader();
            case "master" -> reader = new MasterReader();
            default -> throw new Exception("Not supported card!");
        }

        return reader;
    }
}
