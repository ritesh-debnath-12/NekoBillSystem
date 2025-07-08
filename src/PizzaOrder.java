import java.util.Date;
import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class PizzaOrder {
    public static void main(String[] args) {
        // TO-DO: Implement Scanner Class and take user input
        // To-Do: Remove hardcoded elements
        // INITIAL VARIABLE DECLARATION STARTS HERE....
        String          customerName                = "Gary";
        String          customerEmail               = "gary@123.com";
        long            phoneNumber                 = 412312345L;
        String          address                     = "20, Marble Drive, Eville";
        int             numberOfPizzasOrdered       = 5;
        float           pizzaPrice                  = 12.5f;
        char            pizzaSlice                  = 'M';
        int             noOfGarlicBreadOrdered      = 3;
        float           garlicBreadPrice            = 5.99f;
        int             noOfBeveragesOrdered        = 3;
        float           beveragePrice               = 1.99f;
        // INITIAL VARIABLE DECLARATION ENDS HERE....

        // more calculations....
        float           totalPizzaPrice             = pizzaPrice * numberOfPizzasOrdered;
        float           totalGarlicBreadPrice       = garlicBreadPrice * noOfGarlicBreadOrdered;
        float           totalBeveragePrice          = beveragePrice * noOfBeveragesOrdered;

        float           GRAND_TOTAL                 = totalPizzaPrice + totalBeveragePrice + totalGarlicBreadPrice;
        boolean         isGreaterThan100            = GRAND_TOTAL >= 100; // not used anywhere?
        float           GRAND_TOTAL_DISCOUNT        = GRAND_TOTAL - (0.1f * GRAND_TOTAL);

        // time for formatted printing :> (...this stuff took wayyy too much time .·´¯`(>▂<)´¯`·. )
        PAUSE_1();

        // NEKO BILL SYSTEM INTERFACE DRAWING STARTS HERE....
        System.out.format("%150s","================================================\n");
        System.out.format("%103s %30s %14s \n", "||", "GENERATED USING", "||");
        System.out.format("%103s %30s %14s \n", "||", "NEKO BILL SYSTEM", "||");
        System.out.format("%103s %30s %14s \n", "||", "v69.420-SNAPSHOT", "||");
        System.out.format("%103s %30s %14s \n", "||", getDate(), "||");
        System.out.format("%103s %30s %14s \n", "||", getTime(), "||");
        System.out.format("%103s %30s %14s \n", "||", getTimeZone(), "||");
        System.out.format("%150s","================================================\n");
        // NEKO BILL SYSTEM INTERFACE DRAWING ENDS HERE....

        System.out.format("\n\n\n");
        PAUSE_1();

        // CUSTOMER DETAILS HEADER STARTS HERE....
        System.out.format("%150s","================================================\n");
        System.out.format("%103s %30s %14s \n", "||", "CUSTOMER DETAILS", "||");
        System.out.format("%150s","================================================\n");
        // CUSTOMER DETAILS HEADER ENDS HERE....

        System.out.format("\n\n");
        PAUSE_1();

        // CUSTOMER DETAILS BODY STARTS HERE....
        System.out.format("%157s","+---------------------------+------------------------------+\n");
        PAUSE_1();
        System.out.format("%95s | %-25s | %-28s | \n","", "Customer Name", customerName);
        PAUSE_1();
        System.out.format("%95s | %-25s | %-28d | \n","", "Customer Phone Number", phoneNumber);
        PAUSE_1();
        System.out.format("%95s | %-25s | %-28s | \n","", "Customer Email", customerEmail);
        PAUSE_1();
        System.out.format("%95s | %-25s | %-28s | \n","", "Customer Address", address);
        PAUSE_1();
        System.out.format("%157s","+---------------------------+------------------------------+\n");
        PAUSE_1();
        // CUSTOMER DETAILS BODY ENDS HERE....

        System.out.format("\n\n\n");
        PAUSE_1();

        // ORDER SUMMARY HEADER STARTS HERE....
        System.out.format("%150s","================================================\n");
        System.out.format("%103s %30s %14s \n", "||", "ORDER SUMMARY", "||");
        System.out.format("%150s","================================================\n");
        // ORDER SUMMARY HEADER ENDS HERE....

        System.out.format("\n\n");
        PAUSE_1();

        // ORDER SUMMARY BODY STARTS HERE....
        System.out.format("%162s","+-------+-----------------+--------------+-------------+--------+\n");
        PAUSE_1();
        System.out.format("%95s | %s | %-15s | %s | %s | %s | \n","", "Sl.no", "ItemName", "ItemQuantity", "$Price/Unit", "$Total");
        PAUSE_1();
        System.out.format("%162s", "+-------+-----------------+--------------+-------------+--------+\n");
        PAUSE_1();
        System.out.format("%95s | %-5d | %-15s | %-12d | %-11.2f | %-6.2f | \n","", 1, "Pizza", numberOfPizzasOrdered, pizzaPrice, totalPizzaPrice);
        PAUSE_1();
        System.out.format("%95s | %-5d | %-15s | %-12d | %-11.2f | %-6.2f | \n","", 2, "Garlic Bread", noOfGarlicBreadOrdered, garlicBreadPrice, totalGarlicBreadPrice);
        PAUSE_1();
        System.out.format("%95s | %-5d | %-15s | %-12d | %-11.2f | %-6.2f | \n","", 3, "Beverages", noOfBeveragesOrdered, beveragePrice, totalBeveragePrice);
        PAUSE_1();
        System.out.format("%162s","+-------+-----------------+--------------+-------------+--------+\n");
        PAUSE_1();
        System.out.format("%136s %s %-11s %s %-6.2f %s \n", "", "|", "Total", "|", GRAND_TOTAL, "|");
        PAUSE_1();
        System.out.format("%136s %s \n","", "+-------------+--------+");
        PAUSE_1();
        System.out.format("%136s %s %-11s %s %-6s %s \n", "", "|", "DISCOUNT", "|", "10%", "|");
        PAUSE_1();
        System.out.format("%136s %s \n","", "+-------------+--------+");
        PAUSE_1();
        System.out.format("%136s %s %-11s %s %-6.2f %s \n", "", "|", "Grand Price", "|", GRAND_TOTAL_DISCOUNT, "|");
        PAUSE_1();
        System.out.format("%136s %s \n","", "+-------------+--------+");
        PAUSE_1();
        // ORDER SUMMARY BODY ENDS HERE....

        System.out.format("\n\n");
        PAUSE_1();

        // GRAND PRICE INTERFACE DRAWING STARTS HERE....
        System.out.format("%150s","------------------------------------------------\n");
        System.out.format("%102s %20s: %18.2f %5s\n", "|", "Amount to be paid", GRAND_TOTAL_DISCOUNT, "|");
        System.out.format("%150s","------------------------------------------------\n");
        PAUSE_1();
        // GRAND PRICE INTERFACE DRAWING ENDS HERE....

        System.out.format("\n\n");
        PAUSE_1();

        // THANK YOU INTERFACE DRAWING STARTS HERE....
        System.out.format("%150s","================================================\n");
        PAUSE_1();
        System.out.format("%103s %30s %14s \n", "||", "*****THANK YOU*****", "||");
        PAUSE_1();
        System.out.format("%150s","================================================\n");
        // THANK YOU INTERFACE DRAWING ENDS HERE....

        Scanner sc = new Scanner(System.in);
        System.out.println("Press any key to exit...");
        sc.nextLine();
    }
    private static void PAUSE_1() {
        Random rand = new Random();
        try{
            Thread.sleep(rand.nextInt(300, 1000));
        }catch(InterruptedException why){
            System.out.println("This should not have occurred...I should stop pressing shit" +  why.getMessage());
        }
    }

    private static String getDate(){
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");
        return ft.format(new Date());
        }
    private static String getTime(){
        SimpleDateFormat ft = new SimpleDateFormat("HH:mm:ss");
        return ft.format(new Date());
        }
    private static String getTimeZone(){
        SimpleDateFormat ft = new SimpleDateFormat("zzzz");
        return ft.format(new Date());
        }
}