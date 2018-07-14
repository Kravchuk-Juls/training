package com.codespace.workB212P1.task1;

import java.util.*;

public class Runner {
    public void run() {
        int size = 10;
        List<String> listArray = new ArrayList<>();
        for (int index = 0; index < size; index++) {
            listArray.add("number_" + index);
        }
        System.out.println(listArray);

//test Iterator print out
        Iterator<String> iterator = listArray.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }


        List<String> listLink = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            listLink.add("num_" + i);
        }

        Random random = new Random();
        int ranIndex = random.nextInt(listLink.size());
        listLink.add(ranIndex, "num_" + ranIndex);


//        ListIterator<String> listIterator = listLink.listIterator(index);
//        while (listIterator.hasNext()) {
//            listIterator.add("num_" + index);
//            listIterator.next();
//        }

//        for (int index = 0; index < size; index++) {
//            listLink.add("num_" + index);
//        }
        System.out.println(listLink);


    }
}
