/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Oak
 */
public class Q2 {
    
    public static int getIntegerFromUser(Scanner sc) {
        int i = 0;
        boolean done = false;
        System.out.print("Please input a number: ");
        
        while(!done) {
            try {
                i = sc.nextInt();
                done = true;
            } catch(IllegalStateException e) {
                throw new IllegalStateException("Scanner is closed, returning");
            } catch(InputMismatchException e) {
                System.out.print("Input is not an integer. Please re-insert the input: ");
                sc.next();
            }
        }
        
        return i;
    }
    
    public static void getArrayFromUser(Scanner sc) {
        try {
            int size = getIntegerFromUser(sc);
            int[] a = new int[size];
            for(int i=0; i<size; i++) {
                a[i] = getIntegerFromUser(sc);
            }
            for(int i=0; i<size; i++) {
                System.out.println(a[i]);
            }
        } catch(IllegalStateException e) {
            System.out.println(e);
        }
        
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        getArrayFromUser(sc);
    }
    
}
