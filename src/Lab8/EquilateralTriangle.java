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
public class EquilateralTriangle implements Triangle {
    
    private double side;
    
    public EquilateralTriangle(double s) {
        this.side = s;
    }

    @Override
    public double getLongestSideLength() {
        return side;
    }

    @Override
    public double getPerimiter() {
        return side*3;
    }

    @Override
    public double getLargestAngle() {
        return 60.0;
    }
    
}
