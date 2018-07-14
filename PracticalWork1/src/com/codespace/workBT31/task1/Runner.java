package com.codespace.workBT31.task1;

import java.io.File;

public class Runner {
    public void run(String[] args) {
        File file = null;
        if (args.length > 0) {
            file = new File(args[0]);
        } else {
            file = new File(".");
        }

        if (file.isDirectory()
//                && file.exists()
                ) {
            File[] files = file.listFiles();
            for (File element : files) {
                System.out.println(element.getName());
            }
        } else {
            System.out.println("file is not a dir");
        }

    }
}
