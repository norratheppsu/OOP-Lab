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
public class MarketingClub extends Club {
    
    protected int budget;
    
    public MarketingClub(String c, int m, int initialBudget) {
	super(c,m);
        budget = initialBudget;
    }
    
    public boolean useBudget(int b) {
        if(b > budget) {
            return false;
        }
        budget = budget - b;
        return true;
    }
    
    @Override
    public int determineBudget() {
        if(budget > 1000) {
            return 0;
        }
        return super.determineBudget();
    }
}
