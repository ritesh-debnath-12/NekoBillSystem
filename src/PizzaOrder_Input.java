import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class PizzaOrder_Input {
    public static void main(String[] args) {
        // TO-DO: Implement Scanner Class and take user input (done!)
        // To-Do: Remove hardcoded elements (done!)
        // INITIAL VARIABLE DECLARATION STARTS HERE....
        String          customerName                ;
        String          customerEmail               ;
        long            phoneNumber                 ;
        String          address                     ;
        int             numberOfPizzasOrdered       ;
        float           pizzaPrice                  ;
        char            pizzaSlice                  ;
        int             noOfGarlicBreadOrdered      ;
        float           garlicBreadPrice            =       5.99f;
        int             noOfBeveragesOrdered        ;
        float           beveragePrice               =       1.99f;
        // INITIAL VARIABLE DECLARATION ENDS HERE....

        Scanner scan = new Scanner(System.in);
        // INITIAL KYC INTERFACE DRAWING STARTS HERE
        System.out.format("%150s","================================================\n");
        System.out.format("%103s %25s %19s \n", "||", "INITIAL KYC", "||");
        System.out.format("%150s","================================================\n");
        // INITIAL KYC INTERFACE DRAWING ENDS HERE

        System.out.format("\n\n\n");
        PAUSE_1();

        // INITIAL KYC INPUT INTERFACE DRAWING STARTS HERE
        System.out.format("%155s" ,"+---------------------------+---------------------------+\n");
        PAUSE_1();
        System.out.format("%117s %9s", "Enter your name: ", "| ");
        customerName = scan.nextLine();
        PAUSE_1();
        System.out.format("%118s %8s", "Enter your email: ", "| ");
        customerEmail = scan.nextLine();
        PAUSE_1();
        System.out.format("%120s %6s", "Enter your address: ", "| ");
        address = scan.nextLine();
        PAUSE_1();
        System.out.format("%120s %6s", "Enter your contact: ", "| ");
        phoneNumber = scan.nextLong();
        PAUSE_1();
        System.out.format("%155s" ,"+---------------------------+---------------------------+\n");
        // INITIAL KYC INPUT INTERFACE DRAWING ENDS HERE

        System.out.format("\n\n\n");
        PAUSE_1();

        // ORDER DETAILS INTERFACE DRAWING STARTS HERE
        System.out.format("%150s","================================================\n");
        System.out.format("%103s %28s %16s \n", "||", "ORDER DETAILS", "||");
        System.out.format("%150s","================================================\n");
        // ORDER DETAILS INTERFACE DRAWING ENDS HERE

        System.out.format("\n\n");
        PAUSE_1();

        // PIZZA INTERFACE DRAWING STARTS HERE
        System.out.format("%155s" ,"+---------------------------+---------------------------+\n");
        PAUSE_1();
        System.out.format("%98s %17s %9s %20s %6s\n", "|",  "Commodity", "|", "Available Sizes", "|");
        PAUSE_1();
        System.out.format("%155s" ,"+---------------------------+--------+--------+---------+\n");
        PAUSE_1();
        System.out.format("%98s %14s %12s %3s %4s %3s %4s %3s %5s \n", "|",  "Pizza", "|", "S", "|", "M", "|", "L", "|");
        PAUSE_1();
        System.out.format("%155s" ,"+---------------------------+--------+--------+---------+\n");
        PAUSE_1();
        System.out.format("%98s %14s %12s %4s %3s %5s %2s %5s %3s \n", "|",  "Price", "|", "8.5", "|", "12.5", "|", "16.5", "|");
        PAUSE_1();
        System.out.format("%155s" ,"+---------------------------+---------------------------+\n");
        // PIZZA INTERFACE DRAWING ENDS HERE

        System.out.format("\n\n");
        PAUSE_1();

        // PIZZA INPUT INTERFACE DRAWING STARTS HERE
        System.out.format("%155s" ,"+---------------------------+---------------------------+\n");
        PAUSE_1();
        System.out.format("%98s %17s %11s", "",  "Enter size", "|\t\t");
        pizzaSlice = scan.next().toUpperCase().charAt(0);
        PAUSE_1();
        System.out.format("%98s %17s %11s", "",  "Enter amt.", "|\t\t");
        numberOfPizzasOrdered = scan.nextInt();
        PAUSE_1();
        System.out.format("%155s" ,"+---------------------------+---------------------------+\n");
        // PIZZA INPUT INTERFACE DRAWING ENDS HERE

        System.out.format("\n\n");
        PAUSE_1();

        // ADDITIONAL INTERFACE DRAWING STARTS HERE
        System.out.format("%155s" ,"+---------------------------+---------------------------+\n");
        PAUSE_1();
        System.out.format("%98s %17s %9s %16s %10s\n", "|",  "Commodity", "|", "Price", "|");
        PAUSE_1();
        System.out.format("%155s" ,"+---------------------------+---------------------------+\n");
        PAUSE_1();
        System.out.format("%98s %20s %6s %16s %10s\n", "|",  "Garlic Bread", "|", "5.99", "|");
        PAUSE_1();
        System.out.format("%98s %16s %10s %16s %10s\n", "|",  "Beverage", "|", "1.99", "|");
        PAUSE_1();
        System.out.format("%155s" ,"+---------------------------+---------------------------+\n");
        // ADDITIONAL INTERFACE DRAWING ENDS HERE

        System.out.format("\n\n");
        PAUSE_1();

        // ADDITIONAL INTERFACE INPUT DRAWING STARTS HERE
        System.out.format("%155s" ,"+---------------------------+---------------------------+\n");
        PAUSE_1();
        System.out.format("%98s %17s %4s", "",  "Enter amt.(garlic bread)", "|\t\t");
        noOfGarlicBreadOrdered = scan.nextInt();
        PAUSE_1();
        System.out.format("%98s %17s %8s", "",  "Enter amt.(beverage)", "|\t\t");
        noOfBeveragesOrdered = scan.nextInt();
        PAUSE_1();
        System.out.format("%155s" ,"+---------------------------+---------------------------+\n");
        // ADDITIONAL INTERFACE INPUT DRAWING ENDS HERE

        System.out.format("\n\n");
        PAUSE_1();

        System.out.format("%150s","================================================\n");
        System.out.format("%103s %25s %19s \n", "||", "BILL SECTION", "||");
        System.out.format("%150s","================================================\n");

        System.out.format("\n\n\n");
        PAUSE_1();

        // more calculations....
        pizzaPrice = switch (pizzaSlice) {
            //8.5 12.5 16.5
            case 'S' -> 8.5f;
            case 'M' -> 12.5f;
            case 'L' -> 16.5f;
            default -> 8.5f;
        };

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
        System.out.format("%103s %30s %14s \n", "||", generateFakeID(), "||");
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

        System.out.println("Press any key to exit...");
        scan.next();
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
    private static char generateAlphabet(){
        Random rand = new Random();
        return (char)rand.nextInt(65, 90);
    }
    private static int generateDigit(){
        Random rand = new Random();
        return rand.nextInt(0, 9);
    }
    private static String generateFakeID(){
        //incoming crazy....
        return "NEK-" + String.valueOf(generateAlphabet()) + generateAlphabet() + generateDigit() + generateDigit() + generateAlphabet() + generateAlphabet() + generateAlphabet() + generateAlphabet() + generateDigit();
    }
}