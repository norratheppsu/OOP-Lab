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
public class GradStudent extends PSUStudent {
    
    private int passThesis;
    
    public GradStudent(int a, double g) {
        super(a,g);
        passThesis = 0;
    }

    @Override
    public double getGrade() {
        return gpa*passThesis;
    }
    
}
