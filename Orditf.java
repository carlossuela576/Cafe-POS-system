import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Orditf extends itmPrc{
    Scanner sc = new Scanner(System.in);
    //ATTRIBUTES: variable initialization

    //orders input
    LinkedList<Integer> orders = new LinkedList<>();
    //for storing item prices
    LinkedList<Integer> orderFi = new LinkedList<>();



    //main ordering method
    public void getOrder(){
        boolean cicada = true;
       
        while(cicada){
            System.out.print("order: ");
            int usOrder = (sc.nextInt()-1);
            sc.nextLine();
            orders.add(usOrder);
            
            System.out.print("add order? Y/N: ");
            String addDecision = sc.nextLine().toUpperCase();
            switch (addDecision) {
                case "Y":
                    cicada = true;
                    break;
                case "N":
                    cicada = false;
                    break;
                default:
                    throw new InputMismatchException();
            }
        }
    }
}
