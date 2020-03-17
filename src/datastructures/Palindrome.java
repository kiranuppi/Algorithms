package datastructures;

public class Palindrome
{
    public static void main(String[] args) {

        int i = 434;
       String x =  String.valueOf(i);
        int b  = Integer.valueOf(new StringBuilder(x).reverse().toString());

        if(i==b){
            System.out.println(" datastructures.Palindrome");
        }

        boolean equals1 = x.equals(new StringBuilder(x).reverse().toString());


        String str = "123";
        boolean equals = str.equals(new StringBuilder(str).reverse().toString());
        System.out.println("equals = " + equals);
    }

}
