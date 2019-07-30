/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieboolingapplication;

/**
 *
 * @author luoze
 */
public class Film {
    private int price;
    private int totalSites;
    private int currentBooking;
    private String name;
    private int AgeLimit;
        
    Film(){
        this.price = -1;
        this.totalSites = -1;
        this.currentBooking = -1;
        this.name = "N/A please input name";
    }
    
    Film(int price, int totalSites, String name, int ageLimit){
   
        this.setPrice(price);
        this.setName(name);
        this.setTotalSites(totalSites);
        this.setAgeLimit(ageLimit);
        
        //Initial value of booking should be 0 
        this.setCurrentBooking(0);
    }
    
    public int getSiteLeft(){
        return this.totalSites-this.currentBooking;
    }
    public boolean makeABooking(){
        if(this.currentBooking!=this.totalSites){
            this.currentBooking++;
            return true;
        }else{
            return false;
        }
    }  
    
    @Override
    public String toString(){
        return "Film Title : "+this.getName()
                +"\nPrice : $"+this.getPrice()
                +"\nMinimum Entry Age : "+this.getAgeLimit()
                +"\nCurrently "+ this.getCurrentBooking() + " people booking this movie"            
                +"\nThere are "+this.getSiteLeft()+" sites remaining";
    }
    
    //----helpers
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotalSites() {
        return totalSites;
    }

    public void setTotalSites(int totalSites) {
        this.totalSites = totalSites;
    }

    public int getCurrentBooking() {
        return currentBooking;
    }

    public void setCurrentBooking(int currentBooking) {
        this.currentBooking = currentBooking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgeLimit() {
        return AgeLimit;
    }

    public void setAgeLimit(int AgeLimit) {
        this.AgeLimit = AgeLimit;
    }
       
}
