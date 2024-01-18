package Core;

public class L13_String_Builder {
    public static void main(String[] args){


        stringBuilder();
    }

    private static void stringBuilder() {
        StringBuilder sb = new StringBuilder("Tony");

        //char at index 0
        System.out.println(sb.charAt(0));   //print the character specific place

        //set char at 0 index
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //add character at any index
        sb.insert(2, 'n');
        System.out.println(sb);


        //delete the extra 'n'
        sb.delete(2, 3); // delete only i 2nd index value
        System.out.println(sb);







    }

}
