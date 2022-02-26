package user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    int id;
    private String name, phone_no, DOB, email;
    private String pic;
    private Address address;

    public User(String name, String phone_no, String DOB, String email, String pic, Address address) {
        this.name = name;
        this.phone_no = phone_no;
        this.DOB = DOB;
        this.email = email;
        this.pic = pic;
        this.address = address;
    }

    public User(int id, String name, String phone_no, String DOB, String email, String pic, Address address) {
        this.id = id;
        this.name = name;
        this.phone_no = phone_no;
        this.DOB = DOB;
        this.email = email;
        this.pic = pic;
        this.address = address;
    }

    public User() {

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

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}