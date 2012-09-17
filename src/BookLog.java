public class BookLog implements BooksLogs {

    private Book book;
    private int totalCopies;
    private int unreservedCopies;

    public BookLog(Book book, int totalCopies, int unreservedCopies) {
        this.book = book;
        this.totalCopies =totalCopies;
        this.unreservedCopies = unreservedCopies;
        //To change body of created methods use File | Settings | File Templates.
    }


    public boolean matches(BooksLogs bookLog) {
        if((book.matches(bookLog.getBook()) == false))
            return  false;
        if((totalCopies != 0) && (totalCopies != bookLog.getTotalCopies()))
            return false;
        if((unreservedCopies != 0) && (unreservedCopies != bookLog.getUnreservedCopies()))
            return false;
        return true;  //To change body of created methods use File | Settings | File Templates.
    }

    public Book getBook() {
        return book;
    }

    public Book setBook(BookStub book) {
        this.book = book;
        return this.book;
    }

    public int setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
        return this.totalCopies;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public int setUnreservedCopies(int unreservedCopies) {
        this.unreservedCopies = unreservedCopies;
        return this.unreservedCopies;
    }

    public int getUnreservedCopies() {
        return unreservedCopies;
    }

    public int updateUnreservedCopies(int unreserved) {
        unreservedCopies = unreservedCopies + unreserved;
        return unreservedCopies;  //To change body of created methods use File | Settings | File Templates.
    }
}
