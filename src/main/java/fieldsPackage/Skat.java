package fieldsPackage;

public class Skat extends ModelFields{
    int price;

    public Skat(String name, int price) {
        super(name);
        this.price = price;
    }

    @Override
    public String toString() {
        return "Skat";
    }

}
