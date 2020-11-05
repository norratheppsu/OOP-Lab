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
public class UndergradStudent extends PSUStudent {
    
    private int currentYear;
    
    public UndergradStudent(int a, double g) {
        super(a,g);
        currentYear = 1;
    }

    @Override
    public double getGrade() {
        return gpa*(1+currentYear/10.0);
    }
    
    
}
