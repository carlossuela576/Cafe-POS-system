import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Operations commandInterface = new Operations();
        commandInterface.putDataItem();
        commandInterface.putDataPrice();

        do{
            try {
                //user prompt
                commandInterface.displayMenu();
                //get orders method: from Orditf class
                commandInterface.getOrder();
                //display orders
                commandInterface.displayOrder();
                //total order price
                commandInterface.getTotal();
                //appends transaction to Data --> transactions.txt
                System.out.print("Paid Y/N: ");
                String transactAuth = sc.nextLine().toUpperCase();
                switch (transactAuth) {
                    case "Y":
                        commandInterface.getTransactions();
                        commandInterface.clearTransactions();
                        break;
                    case "N":
                        commandInterface.clearTransactions();
                        break;
                    default:
                        throw new InputMismatchException();
                }
                System.out.println();
            } catch (Exception e) {
                System.out.println("Something went wrong, please try again");
            }
        }
        while(true);
    }
}