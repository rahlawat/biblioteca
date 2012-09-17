public class UserStub extends User {
    public UserStub(String userName, String address, int phoneNo, String openingDate) {
        super(userName, address, phoneNo, openingDate);
    }
    public boolean matches(UserStub user) {
        return true;
    }
}
