/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ramirez_tipperapp.ramirez_insertfunapp;
import java.util.Scanner;
/**
 * Angel Ramirez-Rivera 
 * IT DEV 110 MONDAY
 * Assignment 6
 * @author angelramirez-rivera
 */
public class InsertFunUI_View {
    Scanner input = new Scanner(System.in);  
    boolean again = true;
    
    public InsertFunUI_View(){
        do{}while(again == true);
    }
               
    public void Directions(){
        System.out.println("Please enter words to produce funny results");
    }
    public String FavoriteColor(){
        String color;
        System.out.print("Please enter your favorite color: ");
        color = input.nextLine();
        return color;
    }
    
    public String FavoritePet(){
        String pet;
        System.out.print("Please enter your favorite pet: ");
        pet = input.nextLine();
        return pet;
    }
    
    public String FavoriteCar(){
        String car;
        System.out.print("Please enter your favorite car: ");
        car = input.nextLine();
        return car;
    }
    
    public String FavoriteFood(){
       String food;
       System.out.print("Please enter your favorite food: ");
       food = input.nextLine();
       return food;
    }
    
    public void Poem(String pet, String color, String food, String car){
        System.out.print("Roses are "+color );
        System.out.print(" violets are "+food );
        System.out.print(" can you watch my "+pet );
        System.out.println(" He likes to snooze "+food);
    }
    
    public void runAgain(){
        int selection;
        System.out.println("Run application  again?\n(1)yes (2)no");
        selection = input.nextInt();
        if (selection == 2){
        again = true;     
        }
    }
}
