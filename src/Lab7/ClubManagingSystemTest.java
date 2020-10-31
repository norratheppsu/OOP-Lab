/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

/**
 *
 * @author Oak
 */
public class ClubManagingSystemTest {
    
    public static void main(String[] args) {
        Club c0 = new Club("Student", 10);
        c0.addMember(190);
        SportsClub c1 = new SportsClub("Football", 22);
        c1.addMember(18);
        ESportsClub c2 = new ESportsClub("RoV", 5);
        MarketingClub c3 = new MarketingClub("Advertising", 2, 100);
        c3.addMember(8);
        
        Club[] clubList = {c0, c1, c2, c3};
        ClubManagingSystem cms = new ClubManagingSystem(clubList);
        
        Club highestClub = cms.getHighestMemberClub();
        System.out.println(highestClub.getName());
        
        System.out.println(cms.determineAllBudget());
        
        System.out.println(cms.getAllMembers());
    }
}
