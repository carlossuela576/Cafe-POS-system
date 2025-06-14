public class Main{
    public static void main(String[] args){
        
        Operations commandInterface = new Operations();
        commandInterface.putDataItem();
        commandInterface.putDataPrice();
        
        do{
            commandInterface.displayMenu();
            //user prompt
            
            //get orders method: from Orditf class
            commandInterface.getOrder();
            //display orders
            commandInterface.displayOrder();
            commandInterface.getTotal();
        }
        while(true);
    }
}