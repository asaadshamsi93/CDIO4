package fieldsPackage;

public class Start extends ModelFields {

    public Start(String name, int price) {
        super(name);
        this.price = price;
    }

    int price;
    @Override
    public String toString() {
        return "Start";
    }


}
