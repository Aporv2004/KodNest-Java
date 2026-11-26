package Day7;

public class Q10 {
    public static void main(String[] args) {
        boolean isLoggedIn = true;
        String Status = (isLoggedIn = true) ? "Welcome" : "Please Login";
        System.out.println(Status);
    }
}
