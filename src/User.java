import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private String userName;
    private String address;
    private int phoneNo;
    String openingDate;

    public User(String userName, String address, int phoneNo, String openingDate) {
        this.userName = userName;
        this.address = address;
        this.phoneNo = phoneNo;
       this.openingDate = openingDate;
    }

    public String setName(String name) {
        this.userName = name;
        return this.userName;
    }

    public String getName() {
        return userName;
    }

    public String setAddress(String address) {
        this.address = address;
        return this.address;
    }

    public String getAddress() {
        return address;
    }

    public int setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
        return this.phoneNo;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public String setOpeningDate(String openingDate) {
        this.openingDate = openingDate;
        return this.openingDate;
    }

    public String getOpeningDate() {
        return openingDate;
    }

    public boolean matches(User user) {
        if(userName != user.getName())
            return false;
        if((address != null) && (user.getAddress() != address))
            return false;
        if((phoneNo != 0) && (phoneNo != user.getPhoneNo()))
            return false;
        if((openingDate != null) && (openingDate != user.getOpeningDate()))
            return false;
        return true;  //To change body of created methods use File | Settings | File Templates.
    }
}
