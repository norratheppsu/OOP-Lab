/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9;

/**
 *
 * @author Oak
 */
public class NumberList {
    
    private Integer[] myArray;
    
    public NumberList(Integer[] in) throws NullPointerException {
        if(in == null) {
            throw new NullPointerException("in cannot be null");
        }
        myArray = in;
    }
    
    public void setElement(int i, Integer element) {
        myArray[i] = element;
    }
    
    public Integer divideElement(int i, Integer element) throws CheckedArithmeticException, NullPointerException {
        if(element == null || myArray[i] == null) {
            throw new NullPointerException("element or myArray[i] is null");
        }
        if(element == 0) {
            throw new CheckedArithmeticException("cannot divide by 0");
        }
        return myArray[i]/element;
    }
    
}
