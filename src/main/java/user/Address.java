package user;

public class Address {
    private String home_no;
    private String street_name, city, state;
    private String pincode;

    public Address(String home_no, String street_name, String city, String state, String pincode) {
        this.home_no = home_no;
        this.street_name = street_name;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public String getHome_no() {
        return home_no;
    }

    public void setHome_no(String home_no) {
        this.home_no = home_no;
    }

    public String getStreet_name() {
        return street_name;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}