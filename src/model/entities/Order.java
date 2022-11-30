package model.entities;

import java.util.*;

public class Order {
    private int id;
    private String date;    // formatted YY-MM-DD
    private String time;    // formatted HR-MIN-SEC
    private Customer customer;
    private HashMap<Food, Integer> productList = new HashMap<Food, Integer>();  // Food, Qty
    private String status; // counter, online-pending, online-complete

    // constructors
    public Order(){}
    public Order(int id, String date, String time, Customer customer, HashMap<Food, Integer> productList){
        this.id = id;
        this.date = date;
        this.time = time;
        this.customer = customer;
        this.productList = productList;
    }

    // getters
    public int getID(){
        return this.id;
    }

    public String getDate(){
        return this.date;
    }

    public String getTime(){
        return this.time;
    }

    public Customer getCustomer(){
        return this.customer;
    }

    public HashMap<Food, Integer> getProductList(){
        return this.productList;
    }

    public String getStatus(){
        return this.status;
    }

    // setters
    public void setID(int id){
        this.id = id;
    }

    public void setDate(String date){
        this.date = date;
    }

    public void setTime(String time){
        this.time = time;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public void setProductList(HashMap<Food, Integer> productList){
        this.productList = productList;
    }

    public void setStatus(String status){
        this.status = status;
    }
}
