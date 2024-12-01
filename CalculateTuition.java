public class CalculateTuition {
    public static void main(String[] args) {
        // intial tuition for this year
        double tuition = 10000;
        // tuition total for four years after tenth year
        double tuitionTotal = 0;
        // for loop that increases tuition by 5% each year for fourteen years
        for (int i = 1; i <= 14; i++) {
            // increases tuition by 5 percent each year
            tuition += tuition * 0.05;
            if (i == 10) {
                // DISPLAY tuition in ten years
                System.out.printf("In ten years the tuition will be: $%.2f%n", tuition);
            }
            if (i > 10) {
                // after tenth year find total for four years.
                tuitionTotal += tuition;
            }
        }
        // DISPLAY total cost of tuition for four year after tenth year
        System.out.printf("The total cost for four years' worth of tuition in ten years will be: $%.2f%n", tuitionTotal);
    }
}
