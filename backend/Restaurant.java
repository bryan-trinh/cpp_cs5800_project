package backend;

import java.util.*;
import java.io.*;

public class Restaurant {
    boolean DEBUG = true;
    // id, Customer
    Hashtable<Integer, Customer> ht = new Hashtable<Integer, Customer>();

    public Restaurant(){
        init();
    }

    public void printTable(){
        System.out.println(this.ht);
    }

    // TODO
    public double getDiscount(String id){
        return 0;
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
                                this.ht.put(s.getBroncoID(), s);
                                break;
                            case 1:
                                Professor p = new Professor();
                                p.setBroncoID(Integer.parseInt(split[0]));
                                p.setFirstName(name[0]);
                                p.setLastName(name[1]);
                                this.ht.put(p.getBroncoID(), p);
                                break;
                            case 2:
                                StudentProfessor sp = new StudentProfessor();
                                sp.setBroncoID(Integer.parseInt(split[0]));
                                sp.setFirstName(name[0]);
                                sp.setLastName(name[1]);
                                this.ht.put(sp.getBroncoID(), sp);
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
            System.out.println(this.ht);
        }
        System.out.println("Read " + tempFile + " successfully!\n");
    }

    private void init(){
        readFile();
    }

    public static void main(String args[]){
        Restaurant r = new Restaurant();
        r.printTable();
    }

}


