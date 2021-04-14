/*
Name: Sophia Keady
ID: 20231555
*/

public class TestContact {
    public static void main(String[] args) {
        Contact johnSmith = new Contact("John Smith", "0123456789", "JohnSmith@gmail.com");
        Contact michaelDHiggins = new Contact("Michael D. Higgins");
        Contact kimKardashian = new Contact("Kim Kardashian", "0385925789157410713919204732738492", "kimk@hotmail.net", "@kimkardashian", "@kimkardashian", "@KimKardashian");

        System.out.println("The name of the president of Ireland is: " + michaelDHiggins.getContactName() + "\n");

        System.out.println("John Smith's old number was: " + johnSmith.getPhoneNumber());
        johnSmith.setPhoneNumber("9876543210");
        System.out.println("His new number is: " + johnSmith.getPhoneNumber() + "\n");

        System.out.println(Contact.toString(kimKardashian) + "\n");
        System.out.println(Contact.toString(johnSmith) + "\n");
        System.out.println(Contact.toString(michaelDHiggins));
    }
}
