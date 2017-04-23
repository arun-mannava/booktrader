package Phase1.Application.models;

import javax.persistence.*;

/**
 * Created by manju on 3/25/2017.
 */
@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int book_id;
    private String courseName;
    private String BOOK_NAME;
    private String iSBN;

    private String AUTHOR;
    private double NEW_PRICE;
    private int USED_PRICE;
    private int RENT_PRICE;
    private int E_TEXTBOOK_PRICE;


    public Book(int book_id, String courseName, String BOOK_NAME, String iSBN, String AUTHOR, double NEW_PRICE, int USED_PRICE, int RENT_PRICE, int e_TEXTBOOK_PRICE) {
        this.book_id = book_id;
        this.courseName = courseName;
        this.BOOK_NAME = BOOK_NAME;
        this.iSBN = iSBN;
        this.AUTHOR = AUTHOR;
        this.NEW_PRICE = NEW_PRICE;
        this.USED_PRICE = USED_PRICE;
        this.RENT_PRICE = RENT_PRICE;
        this.E_TEXTBOOK_PRICE = e_TEXTBOOK_PRICE;

    }

    public Book() {
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getBOOK_NAME() {
        return BOOK_NAME;
    }

    public void setBOOK_NAME(String BOOK_NAME) {
        this.BOOK_NAME = BOOK_NAME;
    }

    public String getiSBN() {
        return iSBN;
    }

    public void setiSBN(String iSBN) {
        this.iSBN = iSBN;
    }

    public String getAUTHOR() {
        return AUTHOR;
    }

    public void setAUTHOR(String AUTHOR) {
        this.AUTHOR = AUTHOR;
    }

    public double getNEW_PRICE() {
        return NEW_PRICE;
    }

    public void setNEW_PRICE(double NEW_PRICE) {
        this.NEW_PRICE = NEW_PRICE;
    }

    public int getUSED_PRICE() {
        return USED_PRICE;
    }

    public void setUSED_PRICE(int USED_PRICE) {
        this.USED_PRICE = USED_PRICE;
    }

    public int getRENT_PRICE() {
        return RENT_PRICE;
    }

    public void setRENT_PRICE(int RENT_PRICE) {
        this.RENT_PRICE = RENT_PRICE;
    }

    public int getE_TEXTBOOK_PRICE() {
        return E_TEXTBOOK_PRICE;
    }

    public void setE_TEXTBOOK_PRICE(int e_TEXTBOOK_PRICE) {
        E_TEXTBOOK_PRICE = e_TEXTBOOK_PRICE;
    }

}
