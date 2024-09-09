package org.kraemer.iterable;

import java.util.*;

public class InterfaceInterableSample {
    public static void main(String[] args) {
        Queue nomes = new LinkedList();
        nomes.add("Java");
        nomes.add("Pyton");
        nomes.add("C++");

        //forEach method;
        nomes.forEach(System.out::println);

        //iterator method;
        Iterator iterator = nomes.iterator();

        //spliterator method;
        Spliterator spliterator = nomes.spliterator();

    }

}
