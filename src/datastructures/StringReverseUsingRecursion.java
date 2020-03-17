package datastructures;

public class StringReverseUsingRecursion {

    public static void main(String[] args) {
        String toBeReversed = "kiran";

        System.out.println("Reversed String = " + reversedString(toBeReversed));
    }

    private static String reversedString(String toBeReversed) {

        if(toBeReversed.isEmpty()){
            System.out.println("Empty String Passed");
            return toBeReversed;
        }
        return reversedString(toBeReversed.substring(1))+toBeReversed.charAt(0);
    }
}
