package anchit.bhushan.api;

import anchit.bhushan.Validator.PhoneAnnotation;


public class Communication {

    private String email;

    @PhoneAnnotation
    private  Phone phone;

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
