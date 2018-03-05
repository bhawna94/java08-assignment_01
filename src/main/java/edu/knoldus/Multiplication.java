package edu.knoldus;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
public class Multiplication {
    public static void main(String args[])
    {
        List<Integer> list1 =  Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(1,2,3,4,5);
        IntStream.range(0, Math.min(list1.size(),list2.size())).mapToObj(i-> list1.get(i)*list2.get(i)).forEach(System.out::println);
    }
}



