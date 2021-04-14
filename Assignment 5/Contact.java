/*
Name: Sophia Keady
ID: 20231555
*/

public class Contact {
    private String contactName = "";
    private String phoneNumber = "";
    private String emailAddress = "";
    private String facebookHandle = "";
    private String instagramHandle = "";
    private String twitterHandle = "";


    //get and set methods
    public String getContactName() {
        return contactName;
    }

    public void setContactName(String name) {
        contactName = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String number) {
        phoneNumber = number;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String email) {
        emailAddress = email;
    }

    public String getFacebookHandle() {
        return facebookHandle;
    }

    public void setFacebookHandle(String facebook) {
        facebookHandle = facebook;
    }

    public String getInstagramHandle() {
        return instagramHandle;
    }

    public void setInstagramHandle(String instagram) {
        instagramHandle = instagram;
    }

    public String getTwitterHandle() {
        return twitterHandle;
    }

    public void setTwitterHandle(String twitter) {
        twitterHandle = twitter;
    }

    //constructor methods
    public Contact(String name) {
        contactName = name;
    } 
    public Contact(String name, String number) {
        contactName = name;
        phoneNumber = number;
    }
    public Contact(String name, String number, String email) {
        contactName = name;
        phoneNumber = number;
        emailAddress = email;
    }
    public Contact(String name, String number, String email, String facebook, String instagram, String twitter) {
        contactName = name;
        phoneNumber = number;
        emailAddress = email;
        facebookHandle = facebook;
        instagramHandle = instagram;
        twitterHandle = twitter;
    }

    //method for the toString method so code isn't rewritten
    public static String toStringIf(String a) {
        String thisA;
        String space = "                              ";
        if (a.length() > 30) {
            thisA = a.substring(0, 27) + "...";
        }
        else {
            int spaceA = 30 - a.length();
            thisA = space.substring(0, spaceA / 2) + a + space.substring(0, spaceA / 2);
            if (a.length() % 2 == 1) {
                thisA += " ";
            }
        }

        return thisA;
    }

    //toString method
    public static String toString(Contact contact) {
        String s = "";
        String t = "";
        
        if (contact.contactName != "") {
            t = toStringIf(contact.contactName);
            s += String.format("Name             :%s%n", t);
        }
        if (contact.phoneNumber != "") {
            t = toStringIf(contact.phoneNumber);
            s += String.format("Phone Number     :%s%n", t);
        }
        if (contact.emailAddress != "") {
            t = toStringIf(contact.emailAddress);
            s += String.format("Email Address    :%s%n", t);
        }
        if (contact.facebookHandle != "") {
            t = toStringIf(contact.facebookHandle);
            s += String.format("Facebook Handle  :%s%n", t);
        }
        if (contact.instagramHandle != "") {
            t = toStringIf(contact.instagramHandle);
            s += String.format("Instagram Handle :%s%n", t);
        }
        if (contact.twitterHandle != "") {
            t = toStringIf(contact.twitterHandle);
            s += String.format("Twitter Handle   :%s%n", t);
        }

        return s;
    }

    public static int compareTo(Contact contact1, Contact contact2) {
        return contact1.getContactName().compareTo(contact2.getContactName());
    }
}