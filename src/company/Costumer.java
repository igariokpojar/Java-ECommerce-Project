package company;

import java.util.*;

public class Costumer {

    private UUID id;
    private String userName;
    private String email;
    private List<Address> address;

    public Costumer(UUID id, String userName, String email, List<Address> address) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.address = address;
    }

    public UUID getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public List<Address> getAddress() {
        return address;
    }

    public Costumer(UUID id, String userName, String email) {
        this.id = id;
        this.userName = userName;
        this.email = email;




    }
}
