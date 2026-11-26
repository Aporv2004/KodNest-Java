package Day6;

public class ElectricityBill {
    public static void main(String[] args) {
        String customerName = "Rahul";
        int unitsConsumed = 350;
        double totalBill = 0;
        double surcharge = 0;

        if (unitsConsumed >= 0 && unitsConsumed <= 100) {
            totalBill = 2 * unitsConsumed;
        } else if (unitsConsumed >= 101 && unitsConsumed <= 200) {
            totalBill = 3 * unitsConsumed;
        } else if (unitsConsumed >= 201 && unitsConsumed <= 300) {
            totalBill = 5 * unitsConsumed;
        } else {
            totalBill = 7 * unitsConsumed;
        }

        if (totalBill > 1000) {
            surcharge = totalBill * 0.05;
            totalBill = totalBill + surcharge;
        }
        if (unitsConsumed <= 0) {
            System.out.println("Invalid Units");
        }

        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Surcharge: " + surcharge);
        System.out.println("Total Bill: " + totalBill);

    }
}
