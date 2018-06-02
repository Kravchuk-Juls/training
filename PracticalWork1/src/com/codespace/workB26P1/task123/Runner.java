package com.codespace.workB26P1.task123;

public class Runner {
    public void run() {
//TASK 1
//        Device testFullDeviceToString = new Device("ABC12345", "Oxford", 115.0);
//        System.out.println(testFullDeviceToString);
//
//        Device testPartialDeviceToString = new Device("FGRF032165", 51.5);
//        System.out.println(testPartialDeviceToString);
//
//        Device testVoidDeviceToString = new Device();
//        System.out.println(testVoidDeviceToString);


//TASK 2
//    Device[] devices = new Device[4];
//    devices[0] = new Monitor("DAW2144533", "Samsung", 565.0, 1920, 1080);
//    devices[1] = new Monitor(1600,900);
//    devices[2] = new EthernetAdapter("JHF0876567", "Toshiba", 77.5, 100, "F0:D9:D1:R4");
//    devices[3] = new EthernetAdapter();
//
//    for (Device dev : devices) {
//        System.out.println(dev);
//    }


//TASK 3
    Device dev1 = new Device("AAA1112233", "LG", 1450.0);
    Device dev2 = new Device("AAA1112233", "LG", 1450.0);
    Device dev3 = new Device("AAA1112233", "LG", 1450.6);
        System.out.println("dev1 equals dev2? - " + dev1.equals(dev2));
        System.out.println("dev1 equals dev3? - " + dev1.equals(dev3));
        System.out.println("dev1 hashCode is " + dev1.hashCode());
        System.out.println("dev2 hashCode is " + dev2.hashCode());
        System.out.println("dev3 hashCode is " + dev3.hashCode());
        System.out.println("________________________");

    Monitor mon1 = new Monitor("AAA1112233", "LG", 1450.0, 1920, 1080);
    Monitor mon2 = new Monitor("AAA1112233", "LG", 1450.0, 1920, 1080);
    Monitor mon3 = new Monitor("AAA1112233", "Toshiba", 1450.0, 1920, 1080);
    Monitor mon4 = new Monitor("AAA1112233", "LG", 1450.0, 1600, 1080);
    Monitor mon5 = new Monitor(1920, 1080);
        System.out.println("mon1 equals mon2? - " + mon1.equals(mon2));
        System.out.println("mon1 equals mon3? - " + mon1.equals(mon3));
        System.out.println("mon1 equals mon4? - " + mon1.equals(mon4));
        System.out.println("mon1 equals mon5? - " + mon1.equals(mon5));
        System.out.println("mon1 hashCode is " + mon1.hashCode());
        System.out.println("mon2 hashCode is " + mon2.hashCode());
        System.out.println("mon3 hashCode is " + mon3.hashCode());
        System.out.println("mon4 hashCode is " + mon4.hashCode());
        System.out.println("mon5 hashCode is " + mon5.hashCode());
        System.out.println("________________________");

    EthernetAdapter eth1 = new EthernetAdapter();
    EthernetAdapter eth2 = new EthernetAdapter("AAA1112233", "LG", 1450.0, 100, "no-info");
    EthernetAdapter eth3 = new EthernetAdapter("ADA124897", "Samsung", 67.0, 100, "no-info");
        System.out.println("eth1 equals eth2? - " + eth1.equals(eth2));
        System.out.println("eth2 equals dev1? - " + eth2.equals(dev1));
        System.out.println("eth3 equals mon3? - " + eth3.equals(mon3));
        System.out.println("eth1 hashCode is " + eth1.hashCode());
        System.out.println("eth2 hashCode is " + eth2.hashCode());
        System.out.println("eth3 hashCode is " + eth3.hashCode());



    }
}
