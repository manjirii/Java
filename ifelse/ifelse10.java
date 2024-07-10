/* Write a unique real-time example of If Else If Else Ladder */

public class ifelse10 {

    public static void main(String[] args) {

        float money = 6000.00f;

        if (money <= 0.00f) {

            System.out.println("Don't Go Anywhere keep starving");
        } else if (money >= 700.00f && money <= 5000.00f) {

            System.out.println("Party at Barbeque Nation");
        } else if (money >= 5000.00f) {

            System.out.println("Dine in 5 star");
        } else {

            System.out.println("Monthly Mess");
        }
    }
}
