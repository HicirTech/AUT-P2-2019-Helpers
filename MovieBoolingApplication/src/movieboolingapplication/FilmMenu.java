/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieboolingapplication;

import java.util.ArrayList;

/**
 *
 * @author luoze
 */
public class FilmMenu {
    private ArrayList<Film> filmList;

    FilmMenu(){
        this.filmList = new ArrayList<>();
    }
    
    public void addFilmIntoList(Film film){
        this.getFilmList().add(film);
    }
    public ArrayList<Film> getFilmList() {
        return filmList;
    }

    public void setFilmList(ArrayList<Film> filmList) {
        this.filmList = filmList;
    }    
    
}
