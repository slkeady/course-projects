public class Assignment {
    public static void main(String[] args) {
        //first line values
        String contactName = "CS4141 Java Programming";
	    String phoneNum = "1234567849322330";
        String email = "Programmer@Java.com";
        String firstLine = "                                        ";

        //second line values
	    String facebook = "FacebookUserName";
	    String twitter = "TwitterUserName";
	    String instagram = "InstagramName";
        String postcode = "ABC DEFG"; 
        String secondLine = "                              ";

        //find the extra spaces needed for the first line
        int spaceContactName = 40 - contactName.length();
        int spacePhoneNum = 40 - phoneNum.length();
        int spaceEmail = 40 - email.length();

        //for if phoneNum is an odd number
        int negPhoneNum = 0;

        //find the extra spaces needed for the second line
        int spaceFacebook = 30 - facebook.length();
        int spaceTwitter = 30 - twitter.length();
        int spaceInstagram = 30 - instagram.length();
        int spacePostcode = 30 - postcode.length();

        //for if twitter and/or instagram are odd numbers
        int negTwitter = 0;
        int negInstagram = 0;

        //if (spaceContactName % 2 != 0) {
        //    spaceContactName = spaceContactName + 1;
        //}
        if (spacePhoneNum % 2 != 0) {
            spacePhoneNum = spacePhoneNum + 1;
            negPhoneNum = -1;
        }
        //if (spaceEmail % 2 != 0) {
        //    spaceEmail = spaceEmail + 1;
        //}

        //if (spaceFacebook % 2 != 0) {
        //    spaceFacebook = spaceFacebook + 1;
        //}
        if (spaceTwitter % 2 != 0) {
            spaceTwitter = spaceTwitter + 1;
            negTwitter = -1;
        }
        if (spaceInstagram % 2 != 0) {
            spaceInstagram = spaceInstagram + 1;
            negInstagram = -1;
        }
        //if (spacePostcode % 2 != 0) {
        //    spacePostcode = spacePostcode + 1;
        //}

        

        //testing
        //System.out.println(spaceTwitter + " " + spaceInstagram);
        System.out.println("         1         2         3         4         5         6         7         8         9         0         1         2");
        System.out.println("123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");

        System.out.print(contactName + firstLine.substring(0, spaceContactName));
        System.out.print(firstLine.substring(0, spacePhoneNum / 2) + phoneNum + firstLine.substring(0, (spacePhoneNum / 2 + negPhoneNum)));
        System.out.print(firstLine.substring(0, spaceEmail) + email);
        System.out.print("\n");

        System.out.print(facebook + secondLine.substring(0, spaceFacebook));
        System.out.print(secondLine.substring(0, spaceTwitter /2) + twitter + secondLine.substring(0, (spaceTwitter /2 + negTwitter)));
        System.out.print(secondLine.substring(0, spaceInstagram /2) + instagram + secondLine.substring(0, (spaceInstagram /2 + negInstagram)));
        System.out.print(secondLine.substring(0, spacePostcode) + postcode);

        System.out.println( "\n" + (contactName.length() + spaceContactName) + " " + (phoneNum.length() + (spacePhoneNum /2) + (spacePhoneNum /2) + negPhoneNum) + " " + (email.length() + spaceEmail));
        System.out.println((facebook.length() + spaceFacebook) + " " + (twitter.length() + (spaceTwitter /2) + (spaceTwitter /2) + negTwitter) + " " + (instagram.length() + (spaceInstagram /2) + (spaceInstagram /2) + negInstagram) + " " + (postcode.length() + spacePostcode));
        



    }
    
}
