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
public class Q1 {
    
    public static float celsiusToFahrenheit(float celsius) {
        return (32 + (celsius*9)/5);
    }
    
    public static void main(String[] args) {
        System.out.println(celsiusToFahrenheit(52));
        System.out.println(celsiusToFahrenheit(0));
    }
}
