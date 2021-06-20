package task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {

        int j = 10;
         int i = 20;

         while (++j < --i);
        System.out.println(i);

        System.out.println(0,1d = 0,1d + 0,1d + 0,1d );

//        Stream.of(120, 410, 85, 32, 314, 12)
//                .filter(x -> x > 100)
//                .forEach(System.out::println);

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Tina", "Tom", "Mike", "Kate"));

//        for (int i = 0; i < list.size(); i ++) {
//            System.out.println(list.get(i));
//        }

//        List<String> list2 = new ArrayList<>(find(list, "T"));
//        for (String name : list2) {
//            System.out.println(name);
//        }

        find2(list, "e");
        
        
        Set<String> set1 = new HashSet<>();
        set1.add("1");
        set1.add("2");

        TreeSet<String> set2 = new TreeSet<>();
        set2.add("2");
        set2.add("1");

        System.out.println(set1.equals(set2));





    }

    public static void find2  (List<String> names,String search) {

        names.stream()
                .filter(x -> x.contains(search))
//                .collect(Collectors.toList())
                .forEach(System.out::println);


    }

    public static List<String> find (List<String> names,String search) {

        List<String> nameList = new ArrayList<>();

        for (int i = 0; i < names.size(); i ++) {
            if (names.get(i).contains(search)) {
                nameList.add(names.get(i));
            }
        }
        return nameList;
    }
}

//Программирование, Разработка
