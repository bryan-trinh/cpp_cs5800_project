package backend;

import java.util.*;

public class HistoricalPrice {
    // key - (food id, date)
    // value - price
    private HashMap<HashMap<Integer, String>, Double> historicalPriceList = new  HashMap<HashMap<Integer, String>, Double>();

    public HistoricalPrice(){}
    public HistoricalPrice( HashMap<HashMap<Integer, String>, Double> historicalPriceList){
        this.historicalPriceList = historicalPriceList;
    }

    // getters
    public HashMap<HashMap<Integer, String>, Double> getHistoricalPriceList(){
        return this.historicalPriceList;
    }

    // setters
    public void setHistoricalPriceList(HashMap<HashMap<Integer, String>, Double> historicalPriceList){
        this.historicalPriceList = historicalPriceList;
    }
}
