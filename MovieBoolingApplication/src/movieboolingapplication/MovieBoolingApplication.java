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
public class MovieBoolingApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Film file = new Film(25,30,"FilmA",15);
//        file.makeABooking();
//        System.out.println(file);
    	BookingController contoller = new BookingController();
    	//contoller.makeNewCustomer();
    	addStaticFilms(contoller);
    	contoller.printOutMenu();
        
        
    }
    
    private static void addStaticFilms(BookingController contoller){
    	contoller.addToMenu(99, 2, "MOIVE A", 15);
    	contoller.addToMenu(199, 2, "MOIVE B", 30);
    	contoller.addToMenu(299, 2, "MOIVE C", 40);
    	contoller.addToMenu(399, 2, "MOIVE D", 15);
    }
    
}
