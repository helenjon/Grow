package com.epam.javar.tasks;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3102 {

    public static List<String> getFileTree(String root) throws IOException {
        List <String> filestree = new ArrayList<>();
//        List <Path> filetreepath= Files.walk(Paths.get(root))
//                .filter(Files::isRegularFile)
//                .collect(Collectors.toList());
//            Stream.of(filetreepath).forEach(e -> filestree.add(filestree.toString()));
//
        List<File> filestList =  Files.walk(Paths.get(root))
                .filter(Files::isRegularFile)
                .map(Path::toFile)
                .collect(Collectors.toList());

        Stream.of(filestList).forEach(e -> filestree.add(filestree.toString()));


        return filestree;


    }


    public static void main(String[] args) throws IOException {
        getFileTree("D:\\PENSKE\\hos-6321").stream().forEach(e -> System.out.println(e));
    }


}
