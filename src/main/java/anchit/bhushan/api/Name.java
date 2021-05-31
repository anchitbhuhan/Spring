package anchit.bhushan.api;

public class Name {

    private String firstname;
    private String middlename;
    private String lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        String fullname = firstname;

        if(middlename!=null)
                fullname = fullname +" "+ middlename;
        if(lastname!=null)
            fullname = fullname +" "+ lastname;

        return fullname;
    }
}
