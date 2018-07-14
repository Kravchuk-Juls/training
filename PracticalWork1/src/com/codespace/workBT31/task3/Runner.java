package com.codespace.workBT31.task3;

import java.io.*;

public class Runner {
    public void run(String[] args) {
        copyFiles(
                new File("C:\\Users\\Yuumi\\Desktop\\test_code\\chapter-1\\BeerSong.java"),
                new File("C:\\Users\\Yuumi\\Desktop\\test.java")
//                new File ("newFile.txt")
        );
        replacementInFile(new File("C:\\Users\\Yuumi\\Desktop\\Puzzle4.java"));
    }

    public void copyFiles(File oldFile, File newFile) {
        System.out.println("Copy file...");
        try (InputStream input = new FileInputStream(oldFile);
             OutputStream output = new FileOutputStream(newFile)) {
            int value;
            while ((value = input.read()) != -1) {
                output.write(value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Copy ended");
    }

    public void replacementInFile(File file) {
        String name = file.getName();
        if (!name.substring(name.lastIndexOf('.') + 1).equals("java")) {
            System.out.println("Invalid file format");
            return;
        }
        System.out.println("Replacing a file...");

        String path = file.getAbsolutePath();
        path = path.substring(0, path.lastIndexOf('\\') + 1);
        File tmp = new File(path + "\\tmp.java");

        try (BufferedReader bf = new BufferedReader(new FileReader(file));
             BufferedWriter bw = new BufferedWriter(new FileWriter(tmp))) {
            String line;
            while ((line = bf.readLine()) != null) {
                line = line.replaceAll("public", "protected");
                bw.write(line);
                bw.write("\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        file.delete();
        tmp.renameTo(file);
        System.out.println("Replacement complete");
    }
}
