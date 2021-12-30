public class Branch {
    private  int ID;
    private String address;
    private String phoneNum;
    public Branch(int ID, String address, String phoneNum)
    {
        this.ID = ID;
        this.address = address;
        this.phoneNum = phoneNum;
    }
    public String getAddress() {
        return address;
    }
    public int getID() {
        return ID;
    }
    public String getPhoneNum() {
        return phoneNum;
    }
    @Override
    public String toString() {
        return  "ID: " + getID() + " Address: " + getAddress() + " Phone Number:" + getPhoneNum();
    }
}
