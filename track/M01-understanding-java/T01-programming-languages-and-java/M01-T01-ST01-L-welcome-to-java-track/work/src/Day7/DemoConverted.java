package Day7;

public class DemoConverted {
    public static void main(String[] args) {
        int marks = 95;

        switch (marks / 10) {
            case 10:
            case 9:
                System.out.println("Grade A");
                break;
            case 8:
                System.out.println("Grade B");
                break;
            case 7:
            case 6:
                System.out.println("Grade C");
                break;
            case 5:
            case 4:
                System.out.println("Grade D");
                break;
            default:
                if (marks >= 35 && marks < 40) {
                    System.out.println("Grade D");
                } else {
                    System.out.println("You are great ... Leave India");
                }
                break;
        }
    }
}
