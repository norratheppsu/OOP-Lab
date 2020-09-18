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
public class Q4 {
    
    public static int evenSum1toN(int n) {
        int sum = 0;
        for(int i=0; i<=n; i=i+2) {
            sum = sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(evenSum1toN(6));
    }
    
}
