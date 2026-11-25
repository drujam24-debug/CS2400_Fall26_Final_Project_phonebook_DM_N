public class Node{

    //INFO OF A CONTACT
    private int contactID; // this is the hashMap or hashTable index of where it resides, could be better maybe since need be unique, or just avoid dupes
    private String name; // person's name
    private String phoneNumber; // phone number including the () and - or not

    /*  if (909) 555-0100 and 9095550100 are to find the same contact, 
     should we find the contact only based on the numbers so we have a method that reads 
     the numbers only then returns it or searchs for its related contact? */

    private String email; // optional for some of the contacts

    // HELPER METHODS

    public Node(int inputID, String inputName, String inputPhoneNumber, String inputEmail) {
        this.contactID = inputID; //since it is the index, will have a tracker int we use to track next spot to define contractID
        this.name = inputName;
        this.phoneNumber = inputPhoneNumber;
        this.email =inputEmail;
    }

    // GETTERS AND SETTERS 
    public int getContactID() {
        return contactID;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    //setters for when info is to be updated
    public void setContactID(int contactID) {
        this.contactID = contactID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}