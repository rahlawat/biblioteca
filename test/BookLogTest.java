import junit.framework.Assert;
import org.junit.Test;

public class BookLogTest {
    @Test
    public void testsetBook() throws Exception {
        BookStub bookStub = new BookStub("When The Light Fades", "Kathy Rodgers", "1-84223-247-9");
        BookLog bookLog = new BookLog(bookStub,10,8);
        BookStub bookStubChanged = new BookStub("I Don't Know How She Does It","Allison Pearson","9-78009-957-0");
        Assert.assertEquals(bookStubChanged,bookLog.setBook(bookStubChanged));
    }

    @Test
    public void testgetBook() throws Exception {
        BookStub bookStub = new BookStub("When The Light Fades", "Kathy Rodgers", "1-84223-247-9");
        BookLog bookLog = new BookLog(bookStub,10,8);
        Assert.assertEquals(bookStub,bookLog.getBook());
    }

    @Test
    public void testsetTotalCopies() throws Exception {
        BookStub bookStub = new BookStub("When The Light Fades", "Kathy Rodgers", "1-84223-247-9");
        BookLog bookLog = new BookLog(bookStub,10,8);
        Assert.assertEquals(20,bookLog.setTotalCopies(20));
    }

    @Test
    public void testgetTotalCopies() throws Exception {
        BookStub bookStub = new BookStub("When The Light Fades", "Kathy Rodgers", "1-84223-247-9");
        BookLog bookLog = new BookLog(bookStub,10,8);
        Assert.assertEquals(10,bookLog.getTotalCopies());
    }

    @Test
    public void testsetUnreservedCopies() throws Exception {
        BookStub bookStub = new BookStub("When The Light Fades", "Kathy Rodgers", "1-84223-247-9");
        BookLog bookLog = new BookLog(bookStub,10,8);
        Assert.assertEquals(10,bookLog.setUnreservedCopies(10));
    }

    @Test
    public void testgetUnreservedCopies() throws Exception {
        BookStub bookStub = new BookStub("When The Light Fades", "Kathy Rodgers", "1-84223-247-9");
        BookLog bookLog = new BookLog(bookStub,10,8);
        Assert.assertEquals(8,bookLog.getUnreservedCopies());
    }

    @Test
    public void testmatches() throws Exception {
        BookStub bookStub = new BookStub("When The Light Fades", "Kathy Rodgers", "1-84223-247-9");
        BookLog bookLog = new BookLog(bookStub,10,8);
        Assert.assertEquals(true, bookLog.matches(new BookLog(bookStub,10,8)));
    }

    @Test
    public void testupdateUnreserverCopies() throws Exception {
        BookStub bookStub = new BookStub("When The Light Fades", "Kathy Rodgers", "1-84223-247-9");
        BookLog bookLog = new BookLog(bookStub,10,8);
        Assert.assertEquals(9,bookLog.updateUnreservedCopies(1));
    }
}
