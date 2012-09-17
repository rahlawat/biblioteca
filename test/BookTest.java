import junit.framework.Assert;
import org.junit.Test;

public class BookTest {
    @Test
    public void testsetTitle() throws Exception {
        Book book = new Book("When The Light Fades","Kathy Rodgers","1-84223-247-9");
        Assert.assertEquals("When The Light Shines",book.setTitle("When The Light Shines"));
    }

    @Test
    public void testgetTitle() throws Exception {
        Book book = new Book("When The Light Fades","Kathy Rodgers","1-84223-247-9");
        Assert.assertEquals("When The Light Fades",book.getTitle());
    }

    @Test
    public void testsetAuthor() throws Exception {
        Book book = new Book("When The Light Fades","Kathy Rodgers","1-84223-247-9");
        Assert.assertEquals("Kathy Rodger",book.setAuthor("Kathy Rodger"));
    }

    @Test
    public void testgetAuthor() throws Exception {
        Book book = new Book("When The Light Fades","Kathy Rodgers","1-84223-247-9");
        Assert.assertEquals("Kathy Rodgers",book.getAuthor());
    }

    @Test
    public void testsetISBN() throws Exception {
        Book book = new Book("When The Light Fades","Kathy Rodgers","1-84223-247-9");
        Assert.assertEquals("1-90000-247-9",book.setISBN("1-90000-247-9"));
    }

    @Test
    public void testgetISBN() throws Exception {
        Book book = new Book("When The Light Fades","Kathy Rodgers","1-84223-247-9");
        Assert.assertEquals("1-84223-247-9",book.getISBN());
    }

    @Test
    public void testmatches() throws Exception {
         Book book = new Book("When The Light Fades","Kathy Rodgers","1-84223-247-9");
        Assert.assertEquals(true,book.matches(new Book("When The Light Fades","Kathy Rodgers","1-84223-247-9")));
    }
}
