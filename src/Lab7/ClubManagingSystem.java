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
public class ClubManagingSystem {

    private Club[] clubList;
    
    public ClubManagingSystem(Club[] c) {
        clubList = c;
    }
    
    public int determineAllBudget() {
        int total = 0;
        for(int i=0; i<clubList.length; i++) {
            total = total + clubList[i].determineBudget();
        }
        return total;
    }
    
    public int getAllMembers() {
        int total = 0;
        for(int i=0; i<clubList.length; i++) {
            total = total + clubList[i].getNumMember();
        }
        return total;
    }
    
    public Club getHighestMemberClub() {
        int highestMember = clubList[0].getNumMember();
        Club c = clubList[0];
        
        for(int i=1; i<clubList.length; i++) {
            if(highestMember < clubList[i].getNumMember()) {
                highestMember = clubList[i].getNumMember();
                c = clubList[i];
            }
        }
        return c;
        
    }
}
