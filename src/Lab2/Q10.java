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
public class Q10 {
    
    public static int numCommonIntegers(int[] a1, int[] a2) {
        int numCommon = 0;
        for(int i=0; i<a1.length; i++) {
            int elt1 = a1[i];
            for(int j=0; j<a2.length; j++) {
                
                int elt2 = a2[j];
                
                if(elt1 == elt2) {
                    numCommon = numCommon+1;
                    break;
                }
                
            }
        }
        return numCommon;
    }
    public static void main(String[] args) {
        int[] input1 = {1,5,7,9,22};
        int[] input2 = {22,1,5,88,77};
        // output1 should be 3
        int output1 = numCommonIntegers(input1,input2);
        System.out.println(output1);
    }
}
