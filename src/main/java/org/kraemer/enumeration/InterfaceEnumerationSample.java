package org.kraemer.enumeration;

import java.util.*;

public class InterfaceEnumerationSample {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Java");
        vector.add("Python");
        vector.add("C++");

        for (Enumeration<String> e = vector.elements(); e.hasMoreElements();) {
            System.out.println(e.nextElement());
        }
    }

}
