package anchit.bhushan.api;

import java.util.List;

import javax.validation.Valid;

import anchit.bhushan.Validator.Age;
import anchit.bhushan.Validator.NameAnnotation;

public class User {

    @NameAnnotation
    private Name name;
    //    @Username
    private String username;
    private char[] password;
    private String country;
    private List<String> hobbies;
    private String gender;
    @Age(lower = 30, upper = 70)
    private Integer age;
    @Valid
    private Communication communication;


    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Communication getCommunication() {
        return communication;
    }

    public void setCommunication(Communication communication) {
        this.communication = communication;
    }
}
