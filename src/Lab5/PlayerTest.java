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
public class PlayerTest{
  public static void main(String[] args){
    FootballPlayer f = new FootballPlayer("Ronaldo", 7);
    BasketballPlayer b = new BasketballPlayer("James", 23);
    f.print();
    b.print();
    f.playGame();
    b.playGame();
    System.out.println(f.getMinutesPlayed());
    System.out.println(b.getMinutesPlayed());
    b.changeJerseyNumber(6);
  }
}

