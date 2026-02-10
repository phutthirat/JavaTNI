package CoffeeShop;

public class Frappuccino extends Drink {
    private boolean whipped;

    public Frappuccino(String size, boolean whipped) {
        super("Frappuccino", 40, size);
        this.whipped = whipped;
    }

    @Override
    public double calculateFinalPrice() {
        double whipPrice = whipped ? 15 : 0;
        return getBasePrice() + whipPrice + getSizeExtra();
    }

    @Override
    public String toString() {
        String whipText = whipped ? "\nAdd whipped 15 Baht" : "";
        return super.toString() + whipText + "\nTotal price = " + calculateFinalPrice() + " Baht";
    }
}
