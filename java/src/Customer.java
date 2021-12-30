
public class Customer {
    private int ID = 0;
    private String firstName;
    private String lastName;
    private String license;
    private String address;
    private String phoneNum;
    private String email;

    public Customer(int i,String firstName, String lastName, String license,String address, String phoneNum,String email )
    {
        this.ID =i;
        this.firstName = firstName;
        this.lastName = lastName;
        this.license = license;
        this.address = address;
        this.phoneNum = phoneNum;
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public String getEmail() {
        return email;
    }
    public String getFirstName() {
        return firstName;
    }
    public int getID() {
        return ID;
    }
    public String getLastName() {
        return lastName;
    }
    public String getLicense() {
        return license;
    }
    public String getPhoneNum() {
        return phoneNum;
    }
}
