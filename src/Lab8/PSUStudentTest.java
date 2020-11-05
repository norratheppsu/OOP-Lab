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
public class PSUStudentTest {
    
    public static void main(String[] args) {
        PSUStudent p1 = new UndergradStudent(19, 1.2);
        System.out.println(p1.getAge());
        System.out.println(p1.getGrade());

        PSUStudent p2 = new GradStudent(25, 2.0);
        System.out.println(p2.getAge());
        System.out.println(p2.getGrade());
    }
    
}

