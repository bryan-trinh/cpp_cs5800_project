package backend;

import java.util.*;
import java.io.*;

public class Restaurant {
    boolean DEBUG = false;
    // Customer Id, Customer
    HashMap<Integer, Customer> customerTable = new HashMap<Integer, Customer>();
    
    // Food Id, Food
    HashMap<Integer, Food> foodTable = new HashMap<Integer, Food>();

    // (id, date), price
    HistoricalPrice historicalPriceTable = new HistoricalPrice();

    // order table that is pulled and updated by server
    // order id, order
    HashMap<Integer, Order> orderTable = new HashMap<Integer, Order>();

    // constructor
    public Restaurant(){
        init();
    }

    public void printTable(){
        System.out.println(this.customerTable);
    }

    // testing with reading file
    private void readFile(){
        String tempFile = "file/customer.txt";
        // read file
        try{
            File myfile = new File(tempFile);
            Scanner myReader = new Scanner(myfile);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                String[] split = data.trim().split("\\s*;\\s*");
                if(split.length == 2){
                    String[] split2 = data.trim().split("\\s*,\\s*");
                    if (split2.length == 2){
                        String name[] = split2[0].split(" ");
                        // id; name,role -> role 0=student, 1=teacher, 2=both
                        switch(Integer.parseInt(split2[1])){
                            case 0:
                                Student s = new Student();
                                s.setBroncoID(Integer.parseInt(split[0]));
                                s.setFirstName(name[0]);
                                s.setLastName(name[1]);
                                this.customerTable.put(s.getBroncoID(), s);
                                break;
                            case 1:
                                Professor p = new Professor();
                                p.setBroncoID(Integer.parseInt(split[0]));
                                p.setFirstName(name[0]);
                                p.setLastName(name[1]);
                                this.customerTable.put(p.getBroncoID(), p);
                                break;
                            case 2:
                                StudentProfessor sp = new StudentProfessor();
                                sp.setBroncoID(Integer.parseInt(split[0]));
                                sp.setFirstName(name[0]);
                                sp.setLastName(name[1]);
                                this.customerTable.put(sp.getBroncoID(), sp);
                                break;
                        }
                    }
                }
            }
            myReader.close();
        }
        catch (Exception e){
            System.out.println("Error in reading file");
            e.printStackTrace();
        }

        // debug
        if(DEBUG){
            System.out.println(this.customerTable);
        }
        System.out.println("Read " + tempFile + " successfully!\n");
    }

    // TODO section

    private void init(){
        readFile(); // TODO temporary, will be replaced
        pullOrders();
    }

    // TODO some discount scheme
    public double getDiscount(String id){
        return 0;
    }

    // TODO - pulling/updating orders in the server
    public void pullOrders(){
        // pull all orders into an HashMap<Order ID, Order>
        // this.orderTable = ???

        // for each id check order status, and change all online-pending to online-complete
    }

    // TODO - push order to server
    public void pushOrder(Order order){
        // pulls order first, updating anything
        pullOrders();

        // pushes to server stuff to implement later

        // print receipt
        printReceipt(order);
    }

    // TODO - print receipts
    public void printReceipt(Order order){
        // lambda forEach with key food, value qty
        order.getProductList().forEach((food, qty) -> {
            System.out.println("food: " + food.getName() + ", qty: " + qty);
        });
    }

    // TODO - report consolidate revenue information by customer and period
    public void printReport(String startDate, String endDate){
        // pulls order first, updating anything
        pullOrders();

        // return query of orders within a certain date, store in data structure
        // ???

        // print out orders For Each order in range
        
    }

    public static void main(String args[]){
        Restaurant r = new Restaurant();
        r.printTable();
    }

}


