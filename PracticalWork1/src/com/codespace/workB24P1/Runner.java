package com.codespace.workB24P1;


public class Runner {
    public void run () {
        Book[] books = createBookList(7);
        System.out.println("Books: ");
        print(books);

        updatePrice(books, 10.0);
        System.out.println("\nNew books:");
        print(books);

        showAuthor(books, "author0");
    }

    public Book[] createBookList (int size) {
        Book[] books = new Book[size];
        for (int i=0; i<books.length; i++) {
            books[i] = new Book(i+1, "Title"+i, "Author"+i, "Publisher"+i,
                                1900+(int)(Math.random()*100), 200+i*10,
                                100 + (int)(Math.random()*20));
        }
        return books;
    }

    public void print (Book[] arrays) {
        for (Book element: arrays) {
            element.printInfoBook();
        }
    }

    public void updatePrice (Book[] arrays, double per) {
        for (Book element:arrays) {
            double newPrice = element.getPrice() * (100 - per) / 100.00;
            element.setPrice(newPrice);
        }
    }

    public void showAuthor(Book[] books, String author) {
        System.out.println("\nBooks " + author + ": ");
        boolean authorExists = false;
        for (Book element: books) {
            if (element.getAuthor().toLowerCase().equals(author.toLowerCase())){
                element.printInfoBook();
                authorExists = true;
            }
        }

        if (!authorExists) {
            System.out.println("No author found");
        }
    }

//    private int size;
//    private Book[] books = new Book[size];
//
//    public int getSize() {
//        return size;
//    }
//
//    public void setSize(int size) {
//        this.size = size;
//    }
//
//    public Book[] getBooks() {
//        return books;
//    }
//
//    public void setBooks(Book[] books) {
//        this.books = books;
//    }



}
