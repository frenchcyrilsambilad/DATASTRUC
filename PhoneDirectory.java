public class PhoneDirectory {
    private String firstName;
    private String phoneNumber;

    public PhoneDirectory(String firstName, String phoneNumber) {
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}