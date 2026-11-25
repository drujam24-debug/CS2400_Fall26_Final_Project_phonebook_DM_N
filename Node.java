public class Node{
    private int contactID; // this is the hashMap or hashTable index of where it resides, could be better maybe since need be unique, or just avoid dupes
    private String name; // person's name
    private String phoneNumber; // phone number including the () and - or not

    /*  if (909) 555-0100 and 9095550100 are to find the same contact, 
     should we find the contact only based on the numbers so we have a method that reads 
     the numbers only then returns it or searchs for its related contact? */

    private String email; // optional for some of the contacts

    //NEED HELPER METHODS
}