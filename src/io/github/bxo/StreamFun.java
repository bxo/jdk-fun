package io.github.bxo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFun {

    public static final List<String> list1 = Stream.of("a","b","c").collect(Collectors.toList());
    public static final List<String> list2 = Arrays.asList("a","b","c");

    public static void main(String[] args) {
        map();
        filter();
        filterMap();
        max();
        reduce();
    }

    public static void collect() {
        System.out.println(list1);
        System.out.println(list2);
    }

    public static void map() {
        List<String> uList = Stream.of("a","b","c").map(str -> str.toUpperCase()).collect(Collectors.toList());
        System.out.println(uList);
    }

    public static void filter() {
        List<String> uList = Stream.of("a","ab","c").filter(str -> str.startsWith("a")).collect(Collectors.toList());
        System.out.println(uList);
    }

    public static void filterMap() {
        List<String> uList = Stream.of(Arrays.asList("a","b","c"),Arrays.asList("d","e","f")).flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println(uList);
    }

    public static void max() {
        String max = Stream.of("a","ab","c").max(Comparator.comparing( str -> str.length())).get();
        System.out.println(max);
    }

    public static void reduce() {
        int reduced = Stream.of(2,4,5).reduce(0, (a,b) -> a+b);
        System.out.println(reduced);
    }


}
