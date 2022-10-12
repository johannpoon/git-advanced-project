package com.epam.rd.at.java_collections.exercises;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class SetMapExercises {

    // task 1
    public static <T> void removeDuplicates(Collection<T> collection) {
        List<Integer> list = (List<Integer>) collection;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i< list.size() ; i++) {
            if (!map.containsValue(list.get(i))) {
                map.put(i,list.get(i));
            } else {
                list.remove(i);
                i--;
            }
        }
        list.sort(null);
    }

    // task 2
    public static List<LocalDate> getRandomUniqueDates(int year, int limit) {
        List<LocalDate> localDates = new ArrayList<>();
        for(int i=0; i<limit; i++) {
            localDates.add(LocalDate.of(year, (int) ((Math.random()*1000%12) +1), (int) ((Math.random()*1000%28)+1)));
        }
        List<LocalDate> sortedUniqueList = new ArrayList<>(new TreeSet<>(localDates));
        return sortedUniqueList;
    }

    // task 3
    public static Map<String, String> asMap(String... strings) {
        Map<String, String> map = new HashMap<>();
        Boolean key = true;
        String temp = "";
        if(strings.length == 1) {
            throw new IllegalArgumentException("1");
        }
        for (String str : strings) {
            if (!key){
                map.put(temp, str);
                key = true;
            } else {
                key = false;
            }
            temp = str;
        }
        return map;
    }

    // task 4
    public static Map<Month, Integer> generateMonthAndLengths() {
        Map<Month, Integer> map = new HashMap<>();
        for(int i = 1; i<=12; i++) {
            map.put(Month.of(i), Month.of(i).name().length());
        }
        return map;
    }

    // task 5
    public static Map<Integer, Integer> countDuplicates(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for( Integer i: list) {
            if(map.containsKey(i)) {
                map.replace(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }
        for( Integer i: list) {
            if(map.containsKey(i) && map.get(i) == 1) {
                map.remove(i);
            }
        }
        return map;
    }

    // task 6
    public static List<String> getValuesAndSort(List<Map<String, String>> list) {
        List<String> newList = new ArrayList<>();
        for (Map<String, String> map : list) {
            newList.addAll(map.values());
        }
        newList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length()){
                    return 1;
                }else{
                    return o1.compareTo(o2);
                }
            }
        });
        return newList;
    }

}
