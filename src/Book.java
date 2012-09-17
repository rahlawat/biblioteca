public class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String setTitle(String title) {
        this.title = title;
        return this.title;
    }

    public String setAuthor(String author) {
        this.author = author;
        return this.author;
    }

    public String getAuthor() {
        return author;
    }


    public String setISBN(String ISBN) {
        this.ISBN = ISBN;
        return this.ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean matches(Book book) {
        if(title != book.getTitle())
            return false;
        if((author != null) && (author != book.getAuthor()))
            return false;
        if((ISBN != null) && (ISBN != book.getISBN()))
            return false;
        return true;  //To change body of created methods use File | Settings | File Templates.
    }
}
