/*
Name: Sophia Keady
ID: 20231555
*/

public class TestContactList {
    public static void main(String[] args) {
        ContactList contactList = new ContactList(4);
        Contact jSmith = new Contact("John Smith", "0872934153", "johnsmith@gmail.com");
        Contact mary = new Contact("Mary", "0852843957");
        Contact francis = new Contact("Francis");
        Contact paul = new Contact("Paul", "97393843279873329847293", "paul@hotmail.com", "@paul", "@paul", "@paul");

        contactList.add(jSmith);
        contactList.add(mary);
        contactList.add(francis);
        contactList.add(paul);

        System.out.println("This number is for the contact: " + contactList.nameFor("0852843957"));
        System.out.println("This contact's number is: " + contactList.numberFor("Paul"));
        System.out.println("This number is for the contact: " + contactList.nameFor("843279873329847293", 6));
        System.out.println("This contact's number is: " + contactList.numberFor("cis", 5));

        contactList.display();
    }
}