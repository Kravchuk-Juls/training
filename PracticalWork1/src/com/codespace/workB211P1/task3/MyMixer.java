package com.codespace.workB211P1.task3;

public class MyMixer<T> {
    T[] array;

    public MyMixer(T[] array) {
        this.array = array;
    }

    public void shuffle() {
        for (int i = 0; i < array.length; i++) {
            int position = (int) (Math.random() * (array.length - 1));
            T temp = array[i];
            array[i] = array[position];
            array[position] = temp;
        }

//        Random ran = new Random();
//        for (int i=0; i<array.length; i++) {
//            int position = ran.nextInt(array.length);
//            T temp = array[i];
//            array[i] = array[position];
//            array[position] = temp;
//        }

    }
}
