/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieboolingapplication;

import java.util.Scanner;

/**
 *
 * @author luoze
 */
public class BookingController {
    
    private FilmMenu menu;
    private Customer customer;

   
    public BookingController() {
    	this.menu = new FilmMenu();
    }
    
    public void addToMenu(int price, int totalSites, String name, int ageLimit){
       Film film = new Film(price,totalSites, name,ageLimit);
       menu.addFilmIntoList(film);
    }


    public void askForBooking() {
    	System.out.println("currently avaliable :");
    	this.printOutMenu();
    	
    }
    
    public void makeABooking(int userSelect){
    	if(this.getCustomer()!=null){
        	Film film =this.getMenu().getFilmList().get(userSelect);
        	if(this.getCustomer().getAge()>=
        			film.getAgeLimit()) {
        		System.out.println("Booking Success:"+film.makeABooking());
        	}else {
        		System.out.println("EXCEPTION : USER AGE NOT UP TO THE MINIMUM, BOOKING ABOVE");
        	}
        }else {
        	System.out.println("EXCEPTION :NULL USER ATTENT TO BOOKING SYSTEM, MAKE NEW CUSTOMER");
        	this.makeNewCustomer();
        }
    }
    
    public void makeNewCustomer() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Bruh, what's you name:");
    	String name = scanner.nextLine();
    	System.out.print("Bruh, how old are you:");
    	int age = scanner.nextInt();
    	System.out.print("Bruh, are you student:");
    	boolean isStudent = scanner.nextLine().toLowerCase().charAt(0)=='y';
    	this.customer = new Customer(name,age,isStudent);
    }
    
    public void printOutMenu() {
    	int i = 0;
    	for(Film e : this.menu.getFilmList()) {
    		System.out.println("["+i+++"]"+e.getName()+" Price: $"+e.getPrice());
    	}
    }
    public FilmMenu getMenu() {
        return menu;
    }

    public void setMenu(FilmMenu menu) {
        this.menu = menu;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    
    
    
    
}
