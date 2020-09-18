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
public class Q6 {
    
    public static float electricityCharges(int unit) {
        if(unit < 35) {
            return 85;
        }
        if(unit < 150) {
            return (float) (85 + (unit-35)*1.12);
        }
        return (float) (85 + (150-35)*1.12 + (unit-150)*2.13);
    }
    public static void main(String[] args) {
        System.out.println(electricityCharges(20));
        System.out.println(electricityCharges(50));
        System.out.println(electricityCharges(200));
    }
    
}
