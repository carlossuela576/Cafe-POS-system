public class Operations extends Orditf{
    int sumTotal = 0;

    public void getTotal(){
        for(int i = 0; i < orders.size(); i++){
            int refTotal = orders.get(i);
            sumTotal += prices.get(refTotal);
        }
        System.out.println("Total: " + sumTotal);
    }
}
