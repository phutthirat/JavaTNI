public class Bakery {
    private String flavor;
    private double unitPrice;
    private int packingCost = 5; // กำหนดค่าเริ่มต้นตามภาพที่ 8

    public Bakery(String flavor, double unitPrice) {
        this.flavor = flavor;
        this.unitPrice = unitPrice;
    }

    public Bakery() {
        this.flavor = "";
        this.unitPrice = 0;
    }

    public String getFlavor() {
        return flavor;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getPackingCost() {
        return packingCost;
    }

    public double calculateTotalPrice() {
        return unitPrice + packingCost;
    }

    @Override
    public String toString() {
        return "Thank you for your order!";
    }
}