import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class itemPrice {
    //store items and prices in a Linked List
    LinkedList<String> items = new LinkedList<>();
    LinkedList<Integer> prices = new LinkedList<>();

    
    File Itemtxtfile = new File("Data\\itemElem.txt");
    
    //registering data from text files to LinkedLists
    public void putDataItem(){
        try {
            Scanner readitem = new Scanner(Itemtxtfile);
            while(readitem.hasNext()){
                String data = readitem.nextLine();
                items.add(data);
            }
            readitem.close();
        } catch (FileNotFoundException e) {
            System.out.println("something went wrong");
        }
        
    }

    File PricetxtFile = new File("Data\\prices.txt");
    
    public void putDataPrice(){
        try {
            Scanner readprice = new Scanner(PricetxtFile);
            while(readprice.hasNext()){
                int data = readprice.nextInt();
                prices.add(data);
            }
            readprice.close();
        } catch (FileNotFoundException e) {
            System.out.println("Something went wrong");
        }
    }
    
    public void displayMenu(){
        for(int i = 0; i < prices.size(); i++){
            System.out.println((i+1) + ". " + items.get(i) + " --- " + prices.get(i));
        }
    }
}