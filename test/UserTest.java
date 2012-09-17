import junit.framework.Assert;
import org.junit.Test;

public class UserTest {
    @Test
    public void testsetName() throws Exception {
        User user = new User("Renu Ahlawat","New Delhi",28011250,"01/21/2011");
        String ExpectedResult = "Priya Sharma";
        Assert.assertEquals(ExpectedResult,user.setName(ExpectedResult));

    }

    @Test
    public void testgetName() throws Exception {
        User user = new User("Renu Ahlawat","New Delhi",28011250,"01/21/2011");
        String ExpectedResult = "Renu Ahlawat";
        Assert.assertEquals(ExpectedResult,user.getName());
    }

    @Test
    public void testsetAddress() throws Exception {
        User user = new User("Renu Ahlawat","New Delhi",28011250,"01/21/2011");
        String ExpectedResult = "Delhi";
        Assert.assertEquals(ExpectedResult,user.setAddress(ExpectedResult));
    }

    @Test
    public void testgetAddress() throws Exception {
        User user = new User("Renu Ahlawat","New Delhi",28011250,"01/21/2011");
        String ExpectedResult = "New Delhi";
        Assert.assertEquals(ExpectedResult,user.getAddress());
    }

    @Test
    public void testsetPhoneNo() throws Exception {
        User user = new User("Renu Ahlawat","New Delhi",28011250,"01/21/2011");
        int ExpectedResult = 28017300;
        Assert.assertEquals(ExpectedResult,user.setPhoneNo(ExpectedResult));
    }

    @Test
    public void testgetPhoneNo() throws Exception {
        User user = new User("Renu Ahlawat","New Delhi",28011250,"01/21/2011");
        int ExpectedResult = 28011250;
        Assert.assertEquals(ExpectedResult,user.getPhoneNo());
    }

    @Test
    public void testsetOpeningDate() throws Exception {
        User user = new User("Renu Ahlawat","New Delhi",28011250,"01/21/2011");
        String ExpectedResult = "02/21/2011";
        Assert.assertEquals(ExpectedResult,user.setOpeningDate(ExpectedResult));
    }

    @Test
    public void testgetOpeningdate() throws Exception {
        User user = new User("Renu Ahlawat","New Delhi",28011250,"01/21/2011");
        String ExpectedResult = "01/21/2011";
        Assert.assertEquals(ExpectedResult,user.getOpeningDate());
    }

    @Test
    public void testmatches() throws Exception {
        User user = new User("Renu Ahlawat","New Delhi",28011250,"01/21/2011");
        Assert.assertEquals(true,user.matches(new User("Renu Ahlawat","New Delhi",28011250,"01/21/2011")));
    }
}
