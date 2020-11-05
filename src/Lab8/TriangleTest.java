/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

/**
 *
 * @author super
 */
public class TriangleTest {
    
    public static void main(String[] args) {
        Triangle t1 = new EquilateralTriangle(100);
        System.out.println(t1.getLongestSideLength());
        System.out.println(t1.getPerimiter());
        System.out.println(t1.getLargestAngle());
        
        t1 = new RightTriangle(10,20,25);
        System.out.println(t1.getLongestSideLength());
        System.out.println(t1.getPerimiter());
        System.out.println(t1.getLargestAngle());
    }
    
}
