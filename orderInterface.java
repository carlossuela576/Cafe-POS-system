import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class orderInterface extends itemPrice{
    Scanner sc = new Scanner(System.in);
    //ATTRIBUTES: variable initialization
    //orders input: store indexes to be used to access 'items' and 'prices' list
    LinkedList<Integer> orders = new LinkedList<>();
    

    //main ordering method
    public void getOrder(){
        boolean cicada = true;
       
        System.out.println("Input orders: 1-" + prices.size());
        try{
            while(cicada){
                System.out.print("order: ");
                int usOrder = (sc.nextInt()-1);
                sc.nextLine();
                orders.add(usOrder);
                
                System.out.print("Add, Done, Remove A/D/R: ");
                String addDecision = sc.nextLine().toUpperCase();
                switch (addDecision) {
                    case "A":
                        cicada = true;
                        break;
                    case "D":
                        cicada = false;
                        break;
                    case "R":
                        //show orders
                        for(int i = 0; i < orders.size(); i++){
                        int refVar = orders.get(i);
                        System.out.println(items.get(refVar) + " --- " + prices.get(refVar));
                        }
                        //prompt
                        System.out.print("remove: ");
                        //selection
                        int remo = (sc.nextInt()-1);
                        sc.nextLine();
                        orders.remove(remo);
                        cicada = true;
                        break;
                    default:
                        throw new InputMismatchException();
                }
            }
        } catch(InputMismatchException e){
            e.printStackTrace();
        }
    }

    //displays chosen orders from the menu
    public void displayOrder(){
        System.out.println();
        System.out.println("***re-confirm orders***");
        for(int i = 0; i < orders.size(); i++){
        int refVar = orders.get(i);
        System.out.println(items.get(refVar) + " --- " + prices.get(refVar));
        }
    }
}
