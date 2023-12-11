/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ramirez_tipperapp.ramirez_insertfunapp;
/**
 * Angel Ramirez-Rivera 
 * IT DEV 110 MONDAY
 * Assignment 6
 * @author angelramirez-rivera
 */
public class Game_Controller {
    private InsertFunUI_View view = new InsertFunUI_View();
    private InsertFun insert = new InsertFun();
    
    public void RunApp(){
        String favoriteColor,favoriteFood,favoritePet,favoriteCar;
        
        favoriteColor = view.FavoriteColor();
        favoriteFood = view.FavoriteFood();
        favoritePet = view.FavoritePet();
        favoriteCar = view.FavoriteCar();
        
        insert.setColor(favoriteColor);
        insert.setFood(favoriteFood);
        insert.setPet(favoritePet);
        insert.setCar(favoriteCar);
        
        view.Poem(favoritePet, favoriteColor, favoriteFood, favoriteCar);
        
        view.runAgain();
    }
}
