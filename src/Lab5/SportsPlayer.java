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
public class SportsPlayer{
  protected String name;
  protected int jerseyNumber;
  protected int minutesPlayed;
  
  public SportsPlayer(String n, int j) {
    name = n;
    jerseyNumber = j;
    minutesPlayed = 0;
  }
  
  public void print() {
    System.out.println(name+": "+jerseyNumber);
  }
  
  // Or delete playGame() from SportsPlayer and add it in FootballPlayer
  public void playGame() {
    minutesPlayed = minutesPlayed + 90;
  }
  
  public int getMinutesPlayed() {
    return minutesPlayed;
  }
}
