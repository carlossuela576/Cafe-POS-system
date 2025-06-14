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
            orderInterface.getOrder();
            orderInterface.displayOrder();
        }
        while(true);
    }
}