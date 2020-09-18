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
public class Q3 {
    
    public static void printWeather(int celsius) {
        if(celsius < 0) {
            System.out.println("Freezing weather");
        } else if(celsius < 10) {
            System.out.println("Very cold weather");
        } else if(celsius < 20) {
            System.out.println("Cold weather");
        } else if(celsius < 30) {
            System.out.println("Normal in temp");
        } else if(celsius < 40) {
            System.out.println("Its hot");
        } else {
            System.out.println("Its very hot");
        }
    }
    
    public static void main(String[] args) {
        printWeather(35);
    }
    
}
