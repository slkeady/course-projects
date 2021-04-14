/*
Name: Sophia Keady
ID: 20231555
*/

public class ContactList {
    // the capacity int makes it easy to change the size of the array
    private int defaultCapacity;
    private Contact[] ContactList;

    private int index = 0;

    public ContactList() {
        defaultCapacity = 150;
        ContactList = new Contact[defaultCapacity];
    }
    public ContactList(int capacity) {
        defaultCapacity = capacity;
        ContactList = new Contact[defaultCapacity];
    }

    public boolean add(Contact aContact) {
        if (index <= defaultCapacity - 1) {
            ContactList[index] = new Contact(aContact.getContactName(), aContact.getPhoneNumber(), aContact.getEmailAddress(), aContact.getFacebookHandle(), aContact.getInstagramHandle(), aContact.getTwitterHandle());
            index++;
            return true;
        }
        else {
            return false;
        }
        
    }

    public String nameFor(String number) {
        String s = "";
        int nameIndex = 0;
        boolean match;
        while (nameIndex <= defaultCapacity - 1) {
            match = ContactList[nameIndex].getPhoneNumber().contains(number);
            if (match == true) {
                s = ContactList[nameIndex].getContactName();
                break;
            }
            nameIndex++;
        }
        return s;
    }

    public String numberFor(String name) {
        String s = "";
        int nameIndex = 0;
        while (nameIndex <= defaultCapacity - 1) {
            boolean match = ContactList[nameIndex].getContactName().contains(name);
            if (match == true) {
                s = ContactList[nameIndex].getPhoneNumber();
                break;
            }
            nameIndex++;
        }
        return s;
    }

    public String nameFor(String number, int startPos) {
        String partialNumber = number.substring(startPos - 2);
        return nameFor(partialNumber);
    }

    public String numberFor(String name, int startPos) {
        String partialName = name.substring(startPos - 2);
        return numberFor(partialName);

    }

    public void display() {
        int contactIndex = 0;
        while (contactIndex <= defaultCapacity - 1) {
            System.out.printf("Contact %d of %d%n", contactIndex + 1, defaultCapacity);
            System.out.println(Contact.toString(ContactList[contactIndex]));
            contactIndex++;
        }
    }


}