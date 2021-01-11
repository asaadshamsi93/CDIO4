package fieldsPackage;

public class Street extends ModelFields {
    public int getRent() {
        return rent;
    }

    private int rent;

    @Override
    public String toString() {
        return "Street";
    }

    public Street(String name, int price, int rent) {
        super(name, price);
        this.rent = rent;
    }
}
