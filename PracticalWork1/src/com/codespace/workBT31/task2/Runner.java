package com.codespace.workBT31.task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Runner {
    public void run(String[] args) {
        if (args.length == 0) {
            System.out.println("No file");
            System.exit(-1);
        }

        File file = new File(args[0]);
        if (!file.isFile()) {
            System.out.println("Not a file");
            System.exit(-1);
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            System.out.println("Error input file");
        }
    }
}
