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
public class ClubTest {
    
    public static void main(String[] args) {
        SportsClub badminton = new SportsClub("badminton", 2);
        System.out.println(badminton.determineBudget());
        badminton.addMember(10);
        System.out.println(badminton.determineBudget());
        System.out.println(badminton.getName());
        badminton.changeName("tennis");
        System.out.println(badminton.getName());
        
        MarketingClub pr = new MarketingClub("PR", 1, 10000);
        boolean used = pr.useBudget(20000);
        System.out.println(used);
        used = pr.useBudget(2000);
        System.out.println(used);
        System.out.println(pr.determineBudget());
        used = pr.useBudget(7000);
        System.out.println(used);
        System.out.println(pr.determineBudget());
        
    }
}
