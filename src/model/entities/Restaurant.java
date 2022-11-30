package model.entities;

public class Restaurant {
    boolean DEBUG = false;

    // constructor
    public Restaurant(){
        init();
    }

    // TODO section

    private void init(){
        // launch GUI, start on login page
        pullOrders();
    }

    // TODO - make some type of login function
    public boolean login(String id, String password){
        boolean success = false;
        // verify id/pass via database

        return success;
    }

    // TODO some discount scheme
    public double getDiscount(String id){
        return 0;
    }

    // TODO - pulling/updating orders in the server
    public void pullOrders(){
        // pull all orders into an HashMap<Order ID, Order>
        // this.orderTable = ???

        // update everything else
        // this.customerTable = ???
        // this.foodTable = ???
        // this.historicalPriceTable = ???

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
    	/*
        // lambda forEach with key food, value qty
        order.getProductList().forEach((food, qty) -> {
            System.out.println("food: " + food.getName() + ", qty: " + qty);
        });
        */
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
    }

}


