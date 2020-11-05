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
public class RightTriangle implements Triangle {
    
    private double side1, side2, side3;
    
    public RightTriangle(double s1, double s2, double s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    @Override
    public double getLongestSideLength() {
        if(side1 >= side2 && side1 >= side3) return side1;
        if(side2 >= side1 && side2 >= side3) return side2;
        return side3;
    }

    @Override
    public double getPerimiter() {
        return side1+side2+side3;
    }

    @Override
    public double getLargestAngle() {
        return 60.0;
    }
    
}
