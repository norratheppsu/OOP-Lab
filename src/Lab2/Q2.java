/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

/**
 *
 * @author Oak
 */
public class Q2 {
    
    public static boolean passGrade(float grade) {
        if(grade >= 2.0 && grade <= 4.0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(passGrade((float) 1.9));
        System.out.println(passGrade((float) 5));
        System.out.println(passGrade((float) 3.5));
        System.out.println(passGrade((float) 2));
        System.out.println(passGrade((float) 4.0));
    }
    
}
