package Day7;

public class Q10 {
    public static void main(String[] args) {
        boolean isLoggedin = true;
        String Status = (isLoggedin = true) ? "Welcome" : "Please Login";
        System.out.println(Status);
    }
}
