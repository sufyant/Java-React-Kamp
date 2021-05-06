package Entities;

import java.util.Date;

public class User {
    private String id;
    private String firstName;
    private String lastName;
    private String nickname;
    private String nationalityID;
    private Date   dateOfBirth;

    public User(String id, String firstName, String lastName, String nickname, String nationalityID, Date dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.nationalityID = nationalityID;
        this.dateOfBirth = dateOfBirth;
    }

    public String getUserID() {
        return id;
    }

    public void setUserID(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNationalityID() {
        return nationalityID;
    }

    public void setNationalityID(String nationalityID) {
        this.nationalityID = nationalityID;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}


