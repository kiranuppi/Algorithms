package datastructures;

public class ReverseString {

    public static void main(String[] args) {


        String myStr = "kiran";
String reversedString = "";

        StringBuilder sb = new StringBuilder();
        for(int i=myStr.length()-1;i>=0;i--){
            sb.append(myStr.charAt(i));
            reversedString = reversedString+myStr.charAt(i);
        }
        System.out.println("sb = " + sb);
        System.out.println("reversedString = " + reversedString);

        //create Method and pass and input parameter string
        reverseString(myStr);
        //System.out.println("The reversed string is: " + reversed);

    }


    //Method take string parameter and check string is empty or not
    public static void reverseString(String myStr) {
        if ((myStr == null) || (myStr.length() <= 1)) {
            System.out.print(myStr);
        }
        else{
                System.out.print(myStr.charAt(myStr.length() - 1));
                reverseString(myStr.substring(0, myStr.length() - 1));
            }
        }

}

