// Write a Program to print the countdown of days to submit the assignment
// input : day = 7
// Output : 7 days remaining
//         6 days remaining
//         5 days remaining
//         .
//         .
//         1 day remaining
//         0 days assignment is Overdue

public class simplewhile8 {

    public static void main(String[] args) {

        int day = 0;

        if (day == 0) {

            System.out.println(day + " days Assignment is Overdue");
        } else {
            System.out.println(day + " days remaining");
            day--;
        }
    }
}
