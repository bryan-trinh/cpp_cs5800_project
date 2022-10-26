package backend;

import java.util.*;

public class Restaurant {
    boolean DEBUG = true;
    // id; name,role -> role 0=student, 1=teacher, 2=both
    Hashtable<String, String> ht;

    public Restaurant(){
        init();
    }

    public void printTable(){
        System.out.println(this.ht);
    }

    public double getDiscount(String id){
        String val = this.ht.get(id);
        String[] split = val.trim().split("\\s*,\\s*");
        int role = Integer.parseInt(split[1]);
        double discount;
        switch(role){
            case 1:
            // teacher
            discount = 0.25;
            break;

            case 2:
            // student teacher
            discount = 0.3;
            break;

            default:
            // student
            discount = 0;
        }

        return discount;
    }

    private void init(){
        Customer c = new Customer();
        this.ht = c.getTable();
    }

    public static void main(String args[]){
        Restaurant r = new Restaurant();
        r.printTable();

        System.out.println("Getting discount for id 3");
        System.out.println(r.getDiscount("3"));
    }

}


