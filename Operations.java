import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Operations extends orderInterface{
    LocalDateTime transactionDateTime = LocalDateTime.now();
    DateTimeFormatter dateTimeformat = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");

    int sumTotal = 0;

    //method: gets total price of order
    public void getTotal(){
        for(int i = 0; i < orders.size(); i++){
            int refTotal = orders.get(i);
            sumTotal += prices.get(refTotal);
        }
        System.out.println("Total: " + sumTotal);
        System.out.println();
    }

    //method: appends transaction data
    public void getTransactions(){
        try {
            FileWriter transactionWriter = new FileWriter("Data\\transactions.txt", true);
            String formattedDate = transactionDateTime.format(dateTimeformat);
            transactionWriter.append("transaction: " + sumTotal + " || Date & Time: " + formattedDate + "\n");
            transactionWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clearTransactions(){
        orders.clear();
        sumTotal = 0;
    }
}
