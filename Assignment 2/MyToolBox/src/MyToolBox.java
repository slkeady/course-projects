/*
Name: Sophia Keady
ID: 20231555
*/

public class MyToolBox {
    public static String repeat(String text, int times) {
            String s;
            if (times <= 0) {
                s = "";
            }
            else {
                s = "";
                while (times > 0) {
                    s += text;
                    times--;
                }
            }

            return s;
    }

    public static String noTrailingSpaces(String text) {
        String s = text;
        int i = text.length() - 1;

        while (i >= 0) {
            char t = text.charAt(i);
            if (t != ' ') {
                break;
            }
            s = text.substring(0, i);
            i--;
        }

        return s;
    }

    public static String centre(String text, int width) {
        String s, space;
        space = repeat(" ", width);
        int spaceLength = (space.length() - text.length()) / 2;
        
        s = space.substring(0, spaceLength) + text + space.substring(0, spaceLength);

        if (s.length() % 2 != 0) {
            s = " " + s;
        }

        return s;
    }

    public static String expand(String text, int width) {
        String s;

        if (text.length() < width) {
            s = text + repeat(" ", width - text.length());
        }
        else if (text.length() > width) {
            s = text.substring(0, width);
        }
        else {
            s = text;
        }

        return s;
    }

    public static String trim(String text, int width) {
        //it does the same thing as expand
        String s = expand(text, width);

        return s;
    }
}
