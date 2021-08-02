/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9;

/**
 *
 * @author Oak
 */
public class NumberListTest {
    
    public static void main(String[] args) {
        Integer[] a = new Integer[5];
        NumberList n;
        try{
            n = new NumberList(null);
        } catch(NullPointerException e) {
            System.out.println("Good!");
        }
        
        n = new NumberList(a);
        
        try{
            n.setElement(100, 10);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Good!");
        }
        
        n.setElement(0, 10);
        try{
            n.divideElement(0, 0);
        } catch(CheckedArithmeticException e) {
            System.out.println("Good!");
        }
    }
    
}
