public class Person {
    private String firstName;
    private String surName;
    private int contactNumber;
    private String address;
    private String emailAddress;
    private String date;
public Person (String firstName,String surName, int contactNumber,
               String address, String emailAddress, String date){
    this.firstName=firstName;
    this.surName = firstName;
    this.contactNumber = contactNumber;
    this.address=address;
    this.emailAddress=emailAddress;
    this.date=date;

}
public String getFirstName(){
    return firstName;
}
    public String getSurName(){
        return surName;
    }
    public int getContactNumber(){
        return contactNumber;
    }
    public String getAddress(){
        return address;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    public String getDate(){
        return date;
    }
}
