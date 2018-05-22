package com.codespace.workB24P1;

public class Book {
    private int ID;
    private String title;
    private String author;
    private String publisher;
    private int publishYear;
    private int countPages;
    private double price;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        this.countPages = countPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book(int ID, String title, String author, String publisher,
                int publishYear, int countPages, double price) {
        this.ID = ID;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishYear = publishYear;
        this.countPages = countPages;
        this.price = price;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book() {
    }

    public void printInfoBook() {
        System.out.print("ID = " + this.getID());
        System.out.print(", Title = " + this.title);
        System.out.print(", Author = " + author);
        System.out.print(", Publisher = " + publisher);
        System.out.print(", Publish year = " + publishYear);
        System.out.print(", Count of pages = " + countPages);
        System.out.print(", Price = " + price);
        System.out.println(" ");
    }
}
