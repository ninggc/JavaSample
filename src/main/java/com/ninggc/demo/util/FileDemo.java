package com.ninggc.demo.util;

import com.ninggc.tools.interfaces.IGson;

import java.io.File;
import java.util.*;

public class FileDemo implements IGson {
//    public static void main(String[] args) {
//        File file = new File(".");
////        String[] list = file.list(new FilenameFilter() {
////            @Override
////            public boolean accept(File dir, String name) {
////                return name.length() < 6;
////            }
////        });
//        String[] list = file.list();
//        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
//        System.out.println(gson.toJson(list));
//    }

    public static void main(String[] args) {

        showFileInfo();

//        System.out.println(gson.toJson(local(new File("."))));
//        System.out.println(gson.toJson(reCurseDirs(new File("."))));

    }

    public static void showFileInfo() {
        File f = new File(".");
        System.out.println(f.getPath());
        System.out.println(f.toPath().isAbsolute());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.length());
        System.out.println(f.exists());

        File testFile = new File("test");
//        System.out.println(file.mkdir());
        testFile.renameTo(new File("testRenamed"));
    }


    private static File[] local(File dir) {
        return dir.listFiles();
    }

    static class TreeInfo implements Iterable<File> {
        List<File> dirs = new ArrayList<>();
        List<File> files = new ArrayList<>();

        @Override
        public Iterator<File> iterator() {
            return files.iterator();
        }

        void addAll(TreeInfo treeInfo) {
            dirs.addAll(treeInfo.dirs);
            files.addAll(treeInfo.files);
        }
    }

    private static TreeInfo reCurseDirs(File dir) {
        TreeInfo result = new TreeInfo();
        for (File item : dir.listFiles()) {
            if (item.isDirectory()) {
                result.dirs.add(item);
                result.addAll(reCurseDirs(item));
            } else {
                result.files.add(item);
            }
        }
        return result;
    }
}
