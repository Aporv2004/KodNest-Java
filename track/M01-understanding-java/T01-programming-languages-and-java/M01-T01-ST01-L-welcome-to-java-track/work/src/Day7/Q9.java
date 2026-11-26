package Day7;

public class Q9 {
    public static void main(String[] args) {
        double price = 2500.0;

        double Amount = (price > 2000) ? price - (price * 0.1) : price;

        System.out.println(Amount);
    }
}
