package fieldsPackage;

public class Street extends ModelFields {

    public int getRent() {
        return rent;
    }


    public Street(String name, int price, int rent) {
        super(name);
        this.price = price;
        this.rent = rent;
    }

    public int getPrice() {
        return price;
    }

    int price;
    private int rent;

    @Override
    public String toString() {
        return "street";
    }


}
