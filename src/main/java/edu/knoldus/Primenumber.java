package edu.knoldus;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.stream.Collectors.toList;

public class Primenumber {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int num = rand.nextInt(100);
            myList.add(num);
        }
        System.out.println("Randomly genertaed List is as follows:");
        myList.forEach(System.out::println);
        System.out.println("List of prime numbers are");
        System.out.println(myList.stream().filter(Primenumber::isPrime).collect(toList()));
    }

    private static boolean isPrime(int number)
    {
        if(number <2){
            return false;
        }
        for(int i=2;i<=number/2;i++){
            if(number%i==0)
                return false;
        }
        return true;
    }
}
