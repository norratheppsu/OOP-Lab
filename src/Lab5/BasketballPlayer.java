/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

/**
 *
 * @author super
 */
public class BasketballPlayer extends SportsPlayer {
    
    public BasketballPlayer(String n, int j) {
        super(n,j);
    }
  
    @Override
    public void playGame() {
        minutesPlayed = minutesPlayed + 48;
    }
    
    public void changeJerseyNumber(int newNumber) {
      jerseyNumber = newNumber;
      System.out.println(name+" changes number to "+jerseyNumber);
    }

    
}
