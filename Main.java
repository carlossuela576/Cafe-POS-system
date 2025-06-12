import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        itmPrc itemsAndPrices = new itmPrc();
        Orditf orderInterface = new Orditf();

        itemsAndPrices.putDataItem();
        itemsAndPrices.putDataPrice();

        do{
            itemsAndPrices.displayMenu();
            orderInterface.getOrder();
            orderInterface.displayOrder();
        }
        while(true);
    }
}