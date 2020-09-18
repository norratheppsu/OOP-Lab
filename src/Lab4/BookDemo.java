/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

/**
 *
 * @author Oak
 */
public class BookDemo {
    
    public static void main(String[] args) {
        Book book = new Book("", "", 79.75);
        book.setTitle("Developing Java Software");
        book.setAuthor("Russel Winderand");
        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());
    }
}
