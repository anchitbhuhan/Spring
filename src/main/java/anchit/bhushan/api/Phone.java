package anchit.bhushan.api;

public class Phone {

    private String code ;
    private String number;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return getCode()+"-"+getNumber();
    }
}


