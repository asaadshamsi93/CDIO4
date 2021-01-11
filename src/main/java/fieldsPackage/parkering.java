package fieldsPackage;

public class parkering extends ModelFields{

    public parkering(String name, int price) {
        super(name);
        this.price = price;
    }

    int price;

    @Override
    public String toString() {
        return "parkering";
    }

}
