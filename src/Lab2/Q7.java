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
public class Q7 {
    
    public static void printLeftPyramid() {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++){
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
    
    public static void printPyramid() {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=(5-i); j++){
                System.out.print(" "); 
            }
            for(int j=1; j<=i; j++){
                System.out.print("*"); 
            }
            for(int j=1; j<=(i-1); j++){
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        printLeftPyramid();
        printPyramid();
    }
}
