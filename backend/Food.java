package backend;

// Food class will encompass both dish and beverage
public class Food {
    private int id;
    private String name;

    // constructor
    public Food(){}
    public Food(int id, String name){
        this.id = id;
        this.name = name;
    }

    // getters
    public int getID(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    // setters
    public void setID(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }
}
