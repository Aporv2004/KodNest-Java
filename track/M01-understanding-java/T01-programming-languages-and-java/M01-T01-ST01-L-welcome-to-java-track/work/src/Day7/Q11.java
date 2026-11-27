package Day7;

public class Q11 {
    public static void main(String[] args) {
        int a = 45;
        int b = 78;
        int c = 84;
        String bigger = (a > b && a > c) ? "a is bigger" : (b > a && b > c) ? "b is bigger" : "c is bigger";
        System.out.println(bigger);

    }
}
