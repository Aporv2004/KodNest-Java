package Day7;

public class Q8 {
    public static void main(String[] args) {
        int marks = 97;
        String Status = (marks >= 90) ? "Grade A" : (marks >= 75) ? "Grade B" : "Grade C";
        System.out.println(Status);
    }
}
