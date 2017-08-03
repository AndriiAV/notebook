package model;

import java.time.LocalDate;

public class Record {
    private String lastName;
    private String firstName;
    private String middleName;
    private String nickName;
    private String comment;
    private Group group;
    private String homePhone;
    private String cellPhonel;
    private String cellPhone2; //can be null
    private String email;
    private Address address;
    private LocalDate inputDate = LocalDate.now();
    private LocalDate editDate;


    public String getShortName(){
            return new StringBuilder()
            .append(lastName)
            .append(" ")
            .append(firstName.charAt(0))
            .append(".").toString();
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public Group getGroup() {
        return group;
    }
    public void setGroup(Group group) {
        this.group = group;
    }
    public String getHomePhone() {
        return homePhone;
    }
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }
    public String getCellPhonel() {
        return cellPhonel;
    }
    public void setCellPhonel(String cellPhonel) {
        this.cellPhonel = cellPhonel;
    }
    public String getCellPhone2() {
        return cellPhone2;
    }
    public void setCellPhone2(String cellPhone2) {
        this.cellPhone2 = cellPhone2;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public String getFullAddress() {
        return address.toString();
    }

    public LocalDate getInputDate() {
        return inputDate;
    }

    public Record setInputDate(LocalDate inputDate) {
        this.inputDate = inputDate;
        return this;
    }

    public LocalDate getEditDate() {
        return editDate;
    }

    public Record setEditDate(LocalDate editDate) {
        this.editDate = editDate;
        return this;
    }

}
