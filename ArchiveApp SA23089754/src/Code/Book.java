/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author sa23089754
 */
public class Book {
    
    private String ISBN;
    public String damaged;
    private String title;

    public Book(String ISBN, String damaged, String title) {
        this.ISBN = ISBN;
        this.damaged = damaged;
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }
    
    
}
