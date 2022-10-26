package backend;
import java.util.*;
import java.io.*;

public class Customer {
    boolean DEBUG = false;
    // id; name,role -> role 0=student, 1=teacher, 2=both
    Hashtable<String, String> ht;
    String tempFile = "file/customer.txt";

    public Customer(){
        this.ht = new Hashtable<String, String>();
        readFile();
    }

    public Hashtable<String, String> getTable(){
        return this.ht;
    }

    private void readFile(){
        // read file
        try{
            File myfile = new File(tempFile);
            Scanner myReader = new Scanner(myfile);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                String[] split = data.trim().split("\\s*;\\s*");
                if(split.length == 2){
                    this.ht.put(split[0], split[1]);
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
            System.out.println(this.ht);
        }
        System.out.println("Read " + this.tempFile + " successfully!\n");
    }

    public static void main(String args[]){

    }
}
