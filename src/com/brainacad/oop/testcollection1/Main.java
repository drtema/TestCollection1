package com.brainacad.oop.testcollection1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Dr.tema on 10.03.17.
 */
public class Main {
    public static void main(String... a){
        Collection<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            arrayList.add("number_" + i);
        }

        Iterator<String> iterator = arrayList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
