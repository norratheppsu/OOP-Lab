/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

/**
 *
 * @author super
 */
public class SportsClub extends Club {
    
    public SportsClub(String c, int m) {
	super(c,m);
    }
    
    @Override
    public int determineBudget() {
        return (numMember*1000)+(numMember-minNumMember)*100;
    }
    
    @Override
    public void changeName(String newName) {
        
    }
    
    public int getNumMember() {
        return numMember;
    }
    
  
}
