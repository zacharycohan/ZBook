/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zbook;

import java.util.ArrayList;

/**
 *
 * @author Zack
 */
class Cart {
    private ArrayList<Long> items;
    private int patronID;
    private long startTime;
    private long endTime;
    
    
    public Cart(int patronID)
    {
        this.patronID = patronID;
         items = new ArrayList<>();
    }
    
    public Cart(int patronID,long a, long b)
    {
        this.patronID = patronID;
        startTime = a;
        endTime = b;
        items = new ArrayList<>();
        
    }
    
    public int getPatronID()
    {
        return patronID;
    }
    
    public long get(int i){
        return items.get(i);
    }
    
    public void addItem(Long barcode){
        items.add(barcode);
    }
    
    public int size()
    {
        return items.size();
    }
    
    public long getStartTime(){
        return startTime;
    }
    
    public long getEndTime(){
        return endTime;
    }
    
    public void setStartTime(long a)
    {
        startTime = a;
    }
    
    public void setEndTime(long a)
    {
        endTime = a;
    }
    
    public void setStartEndTime(long a, long b)
    {
        startTime = a;
        endTime = b;
    }
    
    public void clearItems()
    {
        items.clear();
    }
    
}
