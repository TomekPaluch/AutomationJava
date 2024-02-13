package Exercises;

import java.util.ArrayList;
import java.util.List;

public class CompareTwoStringsBySymbols extends UnsupportedOperationException{
    public static void main(String []args){
    String str1 = "Body_moving";
    String str2 = "My body is fat";

    compareTwoStrings(str1, str2);

    }
    public static List<Character> stringToCharacter(String str){
        String stringWithoutSpaces = str.toLowerCase().replaceAll("\\s+","");
        List<Character> characterr = new ArrayList<>();
        for (char ch : stringWithoutSpaces.toCharArray()) {

            characterr.add(ch);
        }

        // return the List
        return characterr;
    }
    public static void compareTwoStrings(String str, String str2)
    {

    List<Character> newList = new ArrayList<>(stringToCharacter(str));
    List<Character> newList2 = new ArrayList<>(stringToCharacter(str2));

    List<Character> newList3 = new ArrayList<>(newList);
    List<Character> newList4 = new ArrayList<>(newList2);
    newList.removeAll(newList2);

    System.out.println(newList);

    System.out.println(newList2);
    }
//    public static String compare_Two_Strings_By_Symbols(String str1, String str2){
//        return ;
//    }
}
