public class Eclairs extends Bakery {
    private String filling;
    private int amount;

    public Eclairs(String filling, int amount, String flavor, double unitPrice) {
        super(flavor, unitPrice);
        this.filling = filling;
        this.amount = amount;
    }

    public boolean isSpecialFilling() {
        return filling.equalsIgnoreCase("Thai Tea") || filling.equalsIgnoreCase("Matcha");
    }

    @Override
    public double calculateTotalPrice() {
        double basePrice = getUnitPrice() * amount;
        // ถ้าเป็นไส้พิเศษ บวกเพิ่มชิ้นละ 2 บาท
        if (isSpecialFilling()) {
            basePrice += (amount * 2);
        }
        return basePrice + getPackingCost();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Eclairs " + getFlavor() + " flavor with " + filling + " filling " + amount + "\n" +
                "Total price of Eclairs = " + calculateTotalPrice();
    }
}
