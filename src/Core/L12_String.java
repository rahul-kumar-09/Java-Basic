package Core;

import java.util.Scanner;

public class L12_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        // String are Immutable


        //string input by User
      /*  String firstName = sc.next();   // it is store and print single word
        String fullName = sc.nextLine();    // it is print line of string
        System.out.println("Your First Name is: " + firstName);
        System.out.println("Your Full Name is : " + fullName);

        */


        //declaration String
        /*  stingDeclaration();*/

        //Concatenation String
      /*  concatenation();*/

        //compare String
      /*  compareString();*/

        //sub String
        subString();




    }

    private static void stingDeclaration() {
        //declare String
        String firstName = "Rahul";
        String lastName = "Kumar";
        String dev = "We are Android developer";

        System.out.println(firstName + " " + lastName);
        System.out.println(dev);
    }

    private static void concatenation(){
        String firstName = "Rahul";
        String lastName = "Kumar";
        String dev = "We are Android developer";


        String fullName = firstName + lastName;   //concatenate
        System.out.println(fullName);

        System.out.println("Find the length of String");
        System.out.println(dev.length()); //find the length of string

        System.out.println("Print string in using charAt");
        for (int i = 0; i < fullName.length(); i ++){
            System.out.println(fullName.charAt(i));
        }

    }

    public static void compareString(){
        String name1 = "Rahul";
        String name2 = "Rahul";

        //1. s1 > s2 : +ve
        //2. s1 == s2: 0
        //3. s1 < s2: -ve

        //using compareTo operator
        if (name1.compareTo(name2) == 0){
            System.out.println("String are Equal");
        } else {
            System.out.println("String are not Equal");
        }

        //using equal to "== " operator
       /* if (name1 == name2){
            System.out.println("String are Equal");
        }else {
            System.out.println("String are not Equal");
        }*/

/*

        if (new String("Hulk") == new String("Hulk")){ //written false answer
            System.out.println("String are Equal");
        }else {
            System.out.println("String are not Equal");
        }
*/

    }


    public static void subString(){
        String sentence = "This is my Gaming Laptop";
        String dev = "We are Android Developer from India";

        String sub = sentence.substring(5, sentence.length());

        String devSub = dev.substring(8);

        System.out.println(sub);
        System.out.println(devSub);


    }



}
