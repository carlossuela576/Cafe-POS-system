public class Main{
    public static void main(String[] args){
        itmPrc itemsAndPrices = new itmPrc();

        itemsAndPrices.putDataItem();
        itemsAndPrices.putDataPrice();

        itemsAndPrices.displayMenu();
    }
}