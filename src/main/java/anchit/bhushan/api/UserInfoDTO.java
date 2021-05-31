package anchit.bhushan.api;

import javax.validation.constraints.AssertTrue;

import anchit.bhushan.Validator.NameAnnotation;

public class UserInfoDTO {

    @NameAnnotation
    private Name name;
    @NameAnnotation
    private Name crushname;
    @AssertTrue(message = "{userInfoDTO.TOI}")
    private boolean TOI;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
    	System.out.println("name set to "+name +" in setName method");
        this.name = name;
    }

    public Name getCrushname() {
        return crushname;
    }

    public void setCrushname(Name crushname) {
        this.crushname = crushname;
    }

    public boolean isTOI() {
        return TOI;
    }

    public void setTOI(boolean TOI) {
        this.TOI = TOI;
    }

    @Override
    public String toString() {
        return "UserInfoDTO{" + "username='" + name + '\'' + ", crushname='" + crushname + '\'' + '}';
    }
}
