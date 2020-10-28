/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

/**
 *
 * @author Oak
 */
public class ESportsClub extends SportsClub {
    
    public ESportsClub(String c, int m) {
	super(c,m);
        this.minNumMember = 1;
    }
    
    @Override
    public void advertise() {
        System.out.println("No need to advertise");
    }
    
}
