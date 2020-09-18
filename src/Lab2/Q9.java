/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;
import java.util.Scanner;

/**
 *
 * @author Oak
 */
public class Q9 {
    public static int[] getInput() {
        
        Scanner sc = new Scanner(System.in);
        // first input = number of values
        System.out.print("Input the number of elements to store in the array : ");
        int numValues = sc.nextInt();
        
        System.out.println("Input "+numValues+" number of elements in the array :");
        
        // store all inputs to array
        int[] values = new int[numValues];
        for(int i=0; i<numValues; i++) {
            System.out.print("element - 0 : ");
            values[i] = sc.nextInt();
        }
        return values;
    }
    
    public static void printForward(int[] in) {
        System.out.println("The values store into the array are :");
        for(int i=0; i<in.length; i++) {
            System.out.print(in[i]+" ");
        }
        System.out.println();
    }
    
    public static void printBackward(int[] in) {
        System.out.println("The values store into the array in reverse are :");
        for(int i=in.length-1; i>=0; i--) {
            System.out.print(in[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] input = getInput();
        printForward(input);
        printBackward(input);
    }
    
}
