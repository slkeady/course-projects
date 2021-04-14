public class Assignment2 {
    public static void main(String[] args) {
        //first line values
        String contactName = "CS4141 Java Programming";
	    String phoneNum = "1234567849790";
        String email = "Programmer@Java.com";
        String firstLine = "                                        ";

        //second line values
	    String facebook = "FacebookUserName";
	    String twitter = "TwitterUserName";
	    String instagram = "InstagramName";
        String postcode = "ABC DEFG"; 
        String secondLine = "                              ";

        if (contactName.length() > 40){
            contactName = contactName.substring(0, 40);
        }
        if (phoneNum.length() > 40){
            phoneNum = phoneNum.substring(0, 40);
        }
        if (email.length() > 40){
            email = email.substring(0, 40);
        }

        if (facebook.length() > 27){
            facebook = facebook.substring(0, 27);
        }
        if (twitter.length() > 27){
            twitter = twitter.substring(0, 27);
        }if (instagram.length() > 27){
            instagram = instagram.substring(0, 27);
        }if (postcode.length() > 28){
            postcode = postcode.substring(0, 28);
        }

        //find the extra spaces needed for the first line
        int spaceContactName = 40 - contactName.length();
        int spacePhoneNum = 40 - phoneNum.length();
        int spaceEmail = 40 - email.length();

        //for if phoneNum is an odd number
        int negPhoneNum = 0;

        //find the extra spaces needed for the second line
        int spaceFacebook = 30 - facebook.length() - 3;
        int spaceTwitter = 30 - twitter.length() - 3;
        int spaceInstagram = 30 - instagram.length() - 3;
        int spacePostcode = 30 - postcode.length() - 2;

        if (spacePhoneNum % 2 != 0) {
            spacePhoneNum = spacePhoneNum + 1;
            negPhoneNum = -1;
        }
        /*if (spaceContactName % 2 != 0) {
            spaceContactName = spaceContactName + 1;
        }
        
        if (spaceEmail % 2 != 0) {
            spaceEmail = spaceEmail + 1;
        }

        if (spaceFacebook % 2 != 0) {
            spaceFacebook = spaceFacebook + 1;
        }
        if (spaceTwitter % 2 != 0) {
            spaceTwitter = spaceTwitter + 1;
            negTwitter = -1;
        }
        if (spaceInstagram % 2 != 0) {
            spaceInstagram = spaceInstagram + 1;
            negInstagram = -1;
        }
        if (spacePostcode % 2 != 0) {
            spacePostcode = spacePostcode + 1;
        }*/

        

        //testing
        //System.out.println(spaceTwitter + " " + spaceInstagram);
        //System.out.println("         1         2         3         4         5         6         7         8         9         0         1         2");
        //System.out.println("123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");

        System.out.print(contactName + firstLine.substring(0, spaceContactName));
        System.out.print(firstLine.substring(0, spacePhoneNum / 2) + phoneNum + firstLine.substring(0, (spacePhoneNum / 2 + negPhoneNum)));
        System.out.print(firstLine.substring(0, spaceEmail) + email);
        System.out.print("\n");

        System.out.print("\uD83D\uDDFF:" + facebook + secondLine.substring(0, spaceFacebook));
        System.out.print("\uD83D\uDC26:" + twitter + secondLine.substring(0, spaceTwitter));
        System.out.print("\uD83D\uDCF7:" + instagram + secondLine.substring(0, spaceInstagram));
        System.out.print("\u2709:" + postcode + secondLine.substring(0, spacePostcode));

        //System.out.println( "\n" + (contactName.length() + spaceContactName) + " " + (phoneNum.length() + (spacePhoneNum /2) + (spacePhoneNum /2) + negPhoneNum) + " " + (email.length() + spaceEmail));
        //System.out.println((facebook.length() + spaceFacebook) + " " + (twitter.length() + (spaceTwitter /2) + (spaceTwitter /2) + negTwitter) + " " + (instagram.length() + (spaceInstagram /2) + (spaceInstagram /2) + negInstagram) + " " + (postcode.length() + spacePostcode));
        



    }
    
}
