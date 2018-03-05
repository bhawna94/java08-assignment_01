package edu.knoldus;

import java.util.*;

public class WordCountInList {

    public static void main(String args[]){

    String input = "My name is Deepak Deepak is my name";
    String[] inputarr = input.split(" ");
    List<String> list = Arrays.asList(inputarr);
    List outputlist = new ArrayList();

    Set<String> set = new HashSet<>(list);
        for (String string : set) {
        long count = list.stream().filter(e -> e.equals(string)).count();
        List listConsistingWordCount = new ArrayList();
        listConsistingWordCount.add(string);
        listConsistingWordCount.add(count);
        outputlist.add(listConsistingWordCount);
    }
        System.out.println(outputlist);


}
}

