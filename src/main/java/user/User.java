package user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    int id;
    private String name, phone_no, email;
    //    private String DOB;
    private String pic, address;
    //    private Address address;
    private String user_type;

    public User() {

    }

    public User(int id, String name, String phone_no, String email, String pic, String address, String user_type) {
        this.id = id;
        this.name = name;
        this.phone_no = phone_no;
        this.email = email;
        this.pic = pic;
        this.address = address;
        this.user_type = user_type;
    }

    public User(String name, String phone_no, String email, String pic, String address, String user_type) {
        this.name = name;
        this.phone_no = phone_no;
        this.email = email;
        this.pic = pic;
        this.address = address;
        this.user_type = user_type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }
}