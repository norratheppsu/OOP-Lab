/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

import Lab5.*;

/**
 *
 * @author super
 */
public class Club {
    
	// name of the club
	protected String clubName;
	// minimum number of members in the club
	protected int minNumMember; 
	// current number of members
	protected int numMember;
        
	public Club(String c, int m) {
            clubName = c;
            minNumMember = m;
            numMember = m;
	}
        
	public void addMember(int num) {
            numMember = numMember+num;
	}
        
        public String getName() {
            return clubName;
	}
        
	public void changeName(String newName) {
            clubName = newName;
	}
        
	public int determineBudget() {
            return (numMember*1000);
	}
        
	public void advertise() {
            System.out.println("Please join club: "+clubName);
	}

}

