import junit.framework.Assert;
import org.junit.Test;

public class ReservedBookTest {
    @Test
    public void testsetBook() throws Exception {
        BookStub bookStub = new BookStub("When The Light Fades", "Kathy Rodgers", "1-84223-247-9");
        UserStub userStub = new UserStub("Renu Ahlawat","New Delhi",28011250,"01/21/2011");
        ReservedBook reserverBook = new ReservedBook(bookStub,userStub,"12/01/2011","12/01/2012");
        BookStub ExpectedBook = new BookStub("When The Light Shines", "Kathy Rodgers", "1-84223-247-9");
        Assert.assertEquals(ExpectedBook,reserverBook.setBook(ExpectedBook));
    }

    @Test
    public void testgetBook() throws Exception {
        BookStub bookStub = new BookStub("When The Light Fades", "Kathy Rodgers", "1-84223-247-9");
        UserStub userStub = new UserStub("Renu Ahlawat","New Delhi",28011250,"01/21/2011");
        ReservedBook reserverBook = new ReservedBook(bookStub,userStub,"12/01/2011","12/01/2012");
        Assert.assertEquals(bookStub,reserverBook.getBook());
    }

    @Test
    public void testsetUser() throws Exception {
        BookStub bookStub = new BookStub("When The Light Fades", "Kathy Rodgers", "1-84223-247-9");
        UserStub userStub = new UserStub("Renu Ahlawat","New Delhi",28011250,"01/21/2011");
        ReservedBook reserverBook = new ReservedBook(bookStub,userStub,"12/01/2011","12/01/2012");
        UserStub ExpectedUser = new UserStub("Priya Sharma","New Delhi",28011250,"01/21/2011");
        Assert.assertEquals(ExpectedUser,reserverBook.setUser(ExpectedUser));
    }

    @Test
    public void testgetUser() throws Exception {
        BookStub bookStub = new BookStub("When The Light Fades", "Kathy Rodgers", "1-84223-247-9");
        UserStub userStub = new UserStub("Renu Ahlawat","New Delhi",28011250,"01/21/2011");
        ReservedBook reserverBook = new ReservedBook(bookStub,userStub,"12/01/2011","12/01/2012");
        Assert.assertEquals(userStub,reserverBook.getUser());
    }

    @Test
    public void testsetDateOfIssue() throws Exception {
        BookStub bookStub = new BookStub("When The Light Fades", "Kathy Rodgers", "1-84223-247-9");
        UserStub userStub = new UserStub("Renu Ahlawat","New Delhi",28011250,"01/21/2011");
        ReservedBook reserverBook = new ReservedBook(bookStub,userStub,"12/01/2011","12/01/2012");
        String ExpectedValue = "01/01/2012";
        Assert.assertEquals(ExpectedValue,reserverBook.setDateOfIssue(ExpectedValue));
    }

    @Test
    public void testgetDateOfIssue() throws Exception {
        BookStub bookStub = new BookStub("When The Light Fades", "Kathy Rodgers", "1-84223-247-9");
        UserStub userStub = new UserStub("Renu Ahlawat","New Delhi",28011250,"01/21/2011");
        ReservedBook reserverBook = new ReservedBook(bookStub,userStub,"12/01/2011","12/01/2012");
        Assert.assertEquals("12/01/2011",reserverBook.getDateOfIssue());
    }

    @Test
    public void testsetLastDate() throws Exception {
        BookStub bookStub = new BookStub("When The Light Fades", "Kathy Rodgers", "1-84223-247-9");
        UserStub userStub = new UserStub("Renu Ahlawat","New Delhi",28011250,"01/21/2011");
        ReservedBook reserverBook = new ReservedBook(bookStub,userStub,"12/01/2011","12/01/2012");
        String ExpectedValue = "01/01/2013";
        Assert.assertEquals(ExpectedValue,reserverBook.setLastDate(ExpectedValue));
    }

    @Test
    public void testgetLastDate() throws Exception {
        BookStub bookStub = new BookStub("When The Light Fades", "Kathy Rodgers", "1-84223-247-9");
        UserStub userStub = new UserStub("Renu Ahlawat","New Delhi",28011250,"01/21/2011");
        ReservedBook reserverBook = new ReservedBook(bookStub,userStub,"12/01/2011","12/01/2012");
        Assert.assertEquals("12/01/2012",reserverBook.getLastDate());
    }

    @Test
    public void testmatches() throws Exception {
        BookStub bookStub = new BookStub("When The Light Fades", "Kathy Rodgers", "1-84223-247-9");
        UserStub userStub = new UserStub("Renu Ahlawat","New Delhi",28011250,"01/21/2011");
        ReservedBook reserverBook = new ReservedBook(bookStub,userStub,"12/01/2011","12/01/2012");
        Assert.assertEquals(true,reserverBook.matches(new ReservedBook(bookStub,userStub,"12/01/2011","12/01/2012")));
    }
}
