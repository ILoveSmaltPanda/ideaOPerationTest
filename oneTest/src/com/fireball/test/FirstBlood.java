package com.fireball.test;

import java.io.File;

public class FirstBlood {
    public static void main(String[] args) {
        System.out.println("firstBlood");
        File file1 = new File("E:\\bb\\dd\\orderone - 副本.xls");
        boolean m = checkFileSize(file1, 1, "k");
        System.out.println(m);
    }
    public static boolean checkFileSize(File file, int size, String unit) {
        long len = file.length();
        double fileSize = 0;
        if ("B".equals(unit.toUpperCase())) {
            fileSize = (double) len;
        } else if ("K".equals(unit.toUpperCase())) {
            fileSize = (double) len / 1024;
        } else if ("M".equals(unit.toUpperCase())) {
            fileSize = (double) len / 1048576;
        } else if ("G".equals(unit.toUpperCase())) {
            fileSize = (double) len / 1073741824;
        }
        if (fileSize > size) {
            return false;
        }
        return true;
    }
}

