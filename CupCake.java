public class CupCake extends Bakery {
    private int piece;

    public CupCake(int piece, String flavor, double unitPrice) {
        super(flavor, unitPrice);
        this.piece = piece;
    }

    public boolean isPackingBox() {
        return piece > 0;
    }

    public int getBoxNumber() {
        return piece / 6;
    }

    public int getBagNumber() {
        return piece % 6;
    }

    @Override
    public int getPackingCost() {
        if (getBoxNumber() > 0) {
            return getBoxNumber() * super.getPackingCost();
        }
        return 0;
    }

    @Override
    public double calculateTotalPrice() {
        double productPrice = getUnitPrice() * piece;
        double bagCost = getBagNumber() * 0.5;
        return productPrice + getPackingCost() + bagCost;
    }

    @Override
    public String toString() {
        String packingInfo = "";
        if (isPackingBox()) {
            packingInfo = "with " + getBoxNumber() + " Box " + getBagNumber() + " Bag";
        }

        return super.toString() + "\n" +
                "Cup cake (" + getFlavor() + ") " + packingInfo + "\n" +
                "Total price of Cup Cake = " + calculateTotalPrice();
    }
}
