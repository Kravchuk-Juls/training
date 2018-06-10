package com.codespace.workB210P1.task12;

public class Runner {
    public void run() {
        MyPhoneBook phones = new MyPhoneBook();
        phones.addPhoneNumber("Kate", "0501112233");
        phones.addPhoneNumber("Jim", "0501112234");
        phones.addPhoneNumber("Lora", "0501112235");
        phones.addPhoneNumber("Paul", "0501112236");
        phones.addPhoneNumber("Mike", "0501112237");
        phones.addPhoneNumber("Angela", "0501112238");
        phones.addPhoneNumber("Moss", "0501112239");
        phones.addPhoneNumber("Zack", "0501112232");
        phones.addPhoneNumber("Kimberly", "0501112231");
        phones.addPhoneNumber("Lisa", "0501112230");

        phones.printPhones();
//TASK2
        System.out.println("____________________________");
        phones.sortByName();
        phones.printPhones();

    }
}
