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
public class ESportsClubTest {
    
    public static void main(String[] args) {
        ESportsClub e = new ESportsClub("Esport", 100);
        // ESportsClub's advertise: No need to advertise
        e.advertise();
        // ESportsClub does not override determineBudget
        // We have to look up the definition of determineBudget 
        // at the higher level of the inheritance tree, which is SportsClub class,
        // since ESportsClub inherits from SportsClub.
        //
        // determineBudget is defined in SportsClub, so this method call will be
        // based on SportsClub's determineBudget():
        // return (numMember*1000)+(numMember-minNumMember)*100;
        // return (100*1000)+(100-1)*100 == return 109900
        System.out.println(e.determineBudget());
        
        // Perform the same process, keep looking up the definition of getName
        // in the inheritance tree
        // It is defined in Club class, which returns name attribute
        System.out.println(e.getName());
        
        // The code below behaves the same way the one above
        // Since method calls are polymorphic (meaning it is chosen
        // based on an object, rather than the variable's type).
        Club c = new ESportsClub("Esport", 100);
        c.advertise();
        System.out.println(c.determineBudget());
        System.out.println(c.getName());
    }
}
