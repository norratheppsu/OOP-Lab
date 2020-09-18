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
public class Q8 {
    
    public static boolean primeTest(int n) {
        for(int i=2; i<n; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        System.out.println(primeTest(6));
        System.out.println(primeTest(16));
        System.out.println(primeTest(17));
        System.out.println(primeTest(31));
        System.out.println(primeTest(32));
    }
}
