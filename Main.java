import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        itmPrc itemsAndPrices = new itmPrc();
        itemsAndPrices.putDataItem();
        itemsAndPrices.putDataPrice();
        Orditf orderInterface = new Orditf();
        
        do{
            itemsAndPrices.displayMenu();
            //user prompt
            System.out.println("Input orders: 1-" + itemsAndPrices.prices.size());
            //get orders method: from Orditf class
            orderInterface.getOrder();
            //display orders
            System.out.println();
            System.out.println("***re-confirm orders***");
            for(int i = 0; i < orderInterface.orders.size(); i++){
            int refVar = orderInterface.orders.get(i);
            System.out.println(itemsAndPrices.items.get(refVar) + " --- " + itemsAndPrices.prices.get(refVar));
            }
            System.out.println();
        }
        while(true);
    }
}