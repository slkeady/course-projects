/*  Name: Sophia Keady
    ID: 20231555
*/

public class Assignment3 {
    public static void main(String[] args) {
        //first line values
        String name = "CS4141 Java Programming";
	    String phoneNo = "+353 (0)81 1234567";
        String email = "Programmer@Java.com";
        //40 spaces for each string
        String firstLine = "                                        ";

        //second line values
	    String facebook = "FacebookUserName";
	    String twitter = "@TwitterUserName";
	    String instagram = "InstagramName";
        String postcode = "WXY 777N";
        //30 spaces for each string
        String secondLine = "                              ";

        //in case any string is > 40
        if (name.length() > 40){
            name = name.substring(0, 40);
        }
        if (phoneNo.length() > 40){
            phoneNo = phoneNo.substring(0, 40);
        }
        if (email.length() > 40){
            email = email.substring(0, 40);
        }

        //in case any string is > 30 (excluding emojis)
        if (facebook.length() > 27){
            facebook = facebook.substring(0, 27);
        }
        if (twitter.length() > 27){
            twitter = twitter.substring(0, 27);
        }
        if (instagram.length() > 27){
            instagram = instagram.substring(0, 27);
        }
        if (postcode.length() > 28){
            postcode = postcode.substring(0, 28);
        }

        //find the extra spaces needed for the first line
        int spaceName = 40 - name.length();
        int spacePhoneNo = 40 - phoneNo.length();
        int spaceEmail = 40 - email.length();

        //for if phoneNo is an odd number
        int negPhoneNo = 0;

        //find the extra spaces needed for the second line
        int spaceFacebook = 30 - facebook.length() - 3;
        int spaceTwitter = 30 - twitter.length() - 3;
        int spaceInstagram = 30 - instagram.length() - 3;
        int spacePostcode = 30 - postcode.length() - 2;

        /*if phoneNo is an odd number, then the spaces around it will divide wrong and leave out a character.
        This makes it so that spacePhoneNo will have one too many spaces around phoneNo, but negPhoneNo will remove a space behind phoneNo so that it will still only take up 40 characters.
        */
        if (spacePhoneNo % 2 != 0) {
            spacePhoneNo = spacePhoneNo + 1;
            negPhoneNo = -1;
        }

        //print everything
        System.out.printf("%s%s%s%s%s%s%s\n", name, firstLine.substring(0, spaceName), firstLine.substring(0, spacePhoneNo / 2), phoneNo, firstLine.substring(0, (spacePhoneNo / 2 + negPhoneNo)), firstLine.substring(0, spaceEmail), email);
        System.out.printf("\uD83D\uDDFF:%s%s\uD83D\uDC26:%s%s\uD83D\uDCF7:%s%s\u2709:%s%s", facebook, secondLine.substring(0, spaceFacebook), twitter, secondLine.substring(0, spaceTwitter), instagram, secondLine.substring(0, spaceInstagram), postcode, secondLine.substring(0, spacePostcode));

    }
}