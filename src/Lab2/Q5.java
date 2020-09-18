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
public class Q5 {
    
    public static int[] getInput() {
        
        Scanner sc = new Scanner(System.in);
        // first input = number of values
        int numValues = sc.nextInt();
        
        // store all inputs to array
        int[] values = new int[numValues];
        for(int i=0; i<numValues; i++) {
            values[i] = sc.nextInt();
        }
        return values;
    }
    
    public static int largestNum() {
        
        int[] values = getInput();
        int max = values[0];
        for(int i=0; i<values.length; i++) {
            if(values[i] > max) {
                max = values[i];
            }
        }
        return max;
        
    }
    public static float averageNum() {
        
        int[] values = getInput();
        int sum = 0;
        for(int i=0; i<values.length; i++) {
            sum = sum + values[i];
        }
        return ((float) sum)/values.length;
        
    }
    
    public static void main(String[] args) {
        System.out.println("Testing largestNum: ");
        System.out.println("Output: "+largestNum());
        System.out.println("Testing averageNum: ");
        System.out.println("Output: "+averageNum());
    }
    
}
