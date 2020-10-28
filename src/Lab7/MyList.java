/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

/**
 *
 * @author super
 * @param <T>
 */
public class MyList<T> {
    
    private T[] list;
    
    public MyList(T[] l) {
        list = l;
    }
    
    public void setElement(int i, T elt) {
        list[i] = elt;
    }
    
    public T getElement(int i) {
        return list[i];
    }
    
    public void swapElement(int i, int j) {
        T tmp = list[i];
        list[i] = list[j];
        list[j] = tmp;
    }
    
    public int size() {
        return list.length;
    }
    
    public static void main(String[] args) {
        Integer[] i = new Integer[5];
        MyList<Integer> m = new MyList<>(i);
        m.setElement(0, 10);
        m.setElement(4, 99);
        System.out.println(m.getElement(0));
        m.swapElement(0, 4);
        System.out.println(m.getElement(0));
        System.out.println(m.size());
        
    }
}
