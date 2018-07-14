package com.codespace.workB210P1.task3;

public class MyPhone {
    private MyPhoneBook phoneBook;

    public MyPhone() {
        phoneBook = new MyPhoneBook();
    }

    class MyPhoneBook {
        private PhoneRecord[] phoneNumbers = new PhoneRecord[10];

        class PhoneRecord {
            private String name;
            private String phone;

            public PhoneRecord(String name, String phone) {
                this.name = name;
                this.phone = phone;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            @Override
            public String toString() {
                return "name=" + name + ", phone=" + phone;
            }
        }

        public void addPhoneNumber(String name, String phone) {
            PhoneRecord record = new PhoneRecord(name, phone);
            for (int i = 0; i < phoneNumbers.length; i++) {
                if (phoneNumbers[i] == null) {
                    phoneNumbers[i] = record;
                    break;
                }
            }
        }

        public void printPhones() {
            for (int i = 0; i < phoneNumbers.length; i++) {
                if (phoneNumbers[i] == null) {
                    break;
                }
                System.out.println(phoneNumbers[i]);
            }
        }
    }

    public void switchOn() {
        System.out.println("Loading PhoneBook records...");

        phoneBook.addPhoneNumber("Kate", "0501112233");
        phoneBook.addPhoneNumber("Jim", "0501112234");
        phoneBook.addPhoneNumber("Lora", "0501112235");
        phoneBook.addPhoneNumber("Paul", "0501112236");
        phoneBook.addPhoneNumber("Mike", "0501112237");
        phoneBook.addPhoneNumber("Angela", "0501112238");
        phoneBook.addPhoneNumber("Moss", "0501112239");
        phoneBook.addPhoneNumber("Zack", "0501112232");
        phoneBook.addPhoneNumber("Kimberly", "0501112231");
        phoneBook.addPhoneNumber("Lisa", "0501112230");

        phoneBook.printPhones();

        System.out.println("Loading is complete");
    }

    public void call(int index) {
        System.out.println("----------------------------");
        System.out.println("Calling to...");
        String result = phoneBook.phoneNumbers[index].toString();
        System.out.println(result);
    }
}
