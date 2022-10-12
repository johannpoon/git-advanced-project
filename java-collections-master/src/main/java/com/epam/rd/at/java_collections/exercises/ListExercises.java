package com.epam.rd.at.java_collections.exercises;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListExercises {

    // task 1
    public static List<Integer> generateNumbers(int x) {
        List<Integer>  intList = new ArrayList<>();
        for (int y = 1; y <= x ; y++) {
            intList.add(y);
        }
        return intList;
    }

    // task 2
    public static LocalDate findMinDate(Collection<LocalDate> collection) {
        LocalDate minDate = LocalDate.of(9999, 12, 31);
        for(LocalDate ld : collection) {
            if(ld.isBefore(minDate)) {
                minDate = ld;
            }
        }
        return minDate;
    }

    // task 3
    public static List<Integer> getOddElements(List<Integer> list) {
        List<Integer> returnList = new ArrayList<>();
        for(Integer num: list) {
            if(num%2 != 0 && !returnList.contains(num)) {
                returnList.add(num);
            }
        }
        return returnList;
    }

    // task 4
    public static List<String> getOnlyNumbers(List<String> list) {
        List<String> newList = new ArrayList<>();
        Boolean isInteger = false;
        for(String s: list) {
            try {
                Integer.parseInt(s);
                isInteger = true;
            } catch (NumberFormatException e) {
                isInteger = false;
            }
            if(isInteger) {
                newList.add(s);
            }
        }
        return newList;
    }

    // task 5
    public static boolean checkNoNegativeValues(List<Integer> list) {
        for(Integer num: list) {
            if(num < 0) {
                return false;
            }
        }
        return true;
    }

    // task 6
    public static void sortByLengthDesc(List<String> list) {
        for(String s: list) {
            String temp = s;
            int j = list.indexOf(s);
            while (j > 0 && temp.length() > list.get(j-1).length())
            {
                list.set(j, list.get(j-1));
                j--;
            }
            list.set(j, temp);
        }
    }

    // task 7
    public static boolean isSortedAlphabeticallyIgnoringCase(List<String> list) {
        int cnt = 0;
        List<String> newList = new ArrayList<>();
        // change all to lower case
        for(String s: list) {
            newList.add(s.toLowerCase());
        }
        for(String s: newList) {
            Boolean numbersAfter = true;
            try {
                Integer.parseInt(String.valueOf(s));
            } catch (NumberFormatException e) {
                numbersAfter = false;
                cnt++;
            }
            // check if numbers are after alphabets
            if(cnt > 0 && numbersAfter) {
                return false;
            }
            // check if its a valid string & not last string in list
            if(!numbersAfter && newList.indexOf(s) != newList.size()-1) {
                int i =0;
                //loop through each char if current char is identical
                while (s.charAt(i) == newList.get(newList.indexOf(s) +1).charAt(i) && i != s.length()-1) {
                    i++;
                    if (s.charAt(i) > newList.get(newList.indexOf(s) +1).charAt(i)) {
                        return false;
                    }
                }
            }

        }
        return true;
    }

    // task 8
    public static boolean checkBrackets(String sequence) {
        // Convert string to character array
        char[] array = sequence.toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '(' || array[i] == '{' || array[i] == '[') {
                list.add(array[i]);
            } else {
                char lastBracket = list.get(list.size()-1);
                if (lastBracket == '(' && array[i] != ')') {
                    return false;
                } else if (lastBracket == '{' && array[i] != '}') {
                    return false;
                } else if (lastBracket == '[' && array[i] != ']') {
                    return false;
                } else {
                    list.remove(list.size()-1);
                }
            }
        }
        return true;
    }

}
