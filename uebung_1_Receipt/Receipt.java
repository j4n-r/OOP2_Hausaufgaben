import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private String shopName;
    private List<ReceiptItem> items = new ArrayList<>();

    public Receipt(String shopName) {
        this.shopName = shopName;
    }

    public void add(ReceiptItem receiptItem) {
        items.add(receiptItem);
    }

    private double calculateSum() {
        double sum = 0;
        for (ReceiptItem item : items) {
            sum += item.getPrice() * item.getQuantity();
        }
        return sum;
    }

    public void print() {
        System.out.println("Ausgabe:");
        System.out.println("*** " + shopName + " ***");
        System.out.println("---");
        for (ReceiptItem item : items) {
            System.out.printf("%-10s %2dx %7.2f%n", item.getName(), item.getQuantity(), item.getPrice());
        }
        System.out.println("---");
        System.out.printf("Summe%17.2f%n", calculateSum());
    }
}
