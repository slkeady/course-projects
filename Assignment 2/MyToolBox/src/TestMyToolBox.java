/*
Name: Sophia Keady
ID: 20231555
*/

public class TestMyToolBox {
    public static void main(String[] args) {

        //test the repeat method
        System.out.printf("%s%n", MyToolBox.repeat("Repeated text, ", 5));
        System.out.printf("%s%n", MyToolBox.repeat("This text won't work", -1));

        //test the noTrailingSpaces method
        System.out.printf("%s<%n", MyToolBox.noTrailingSpaces("This   text     has    lots     of  spaces         "));

        //test the centre method
        System.out.printf("%s<%n", MyToolBox.centre("This text is centered!", 50));

        //test the expand method
        System.out.printf("%s<%n", MyToolBox.expand("This text is expanded!", 40));

        //test the trim method
        System.out.printf("%s<%n", MyToolBox.trim("This text is trimmed!", 10));

    }
}
