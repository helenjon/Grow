package com.epam.javar.task3101;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) throws IOException {
// Первый - path - путь к директории, второй - resultFileAbsolutePath - имя (полный путь) существующего файла, который будет содержать результат
        String pathDirectory = "D:\\Penske\\hos-6321\\";
        String pathReseltFile = "D:\\Penske\\hos-6321\\txt.txt";
//        String pathDirectory = args[0];;
//        String pathReseltFile = args[1];;

        File rez = new File(pathReseltFile);
        //Переименовать resultFileAbsolutePath в allFilesContent.txt (используй метод FileUtils.renameFile(), и, если понадобится, FileUtils.isExist()).
        File allFilesContent = new File(rez.getParent() + "/allFilesContent.txt");
        FileUtils.renameFile(rez, allFilesContent);

        FileOutputStream outputStream = new FileOutputStream(allFilesContent);

        List<File> filestList = Files.walk(Paths.get(pathDirectory))
                .filter(Files::isRegularFile)
                .map(Path::toFile)
                .collect(Collectors.toList());

        List<String> filestListless50Names = new ArrayList<>();
        List<File> filestListless50 = filestList.stream().filter(e -> e.length() <= 250).collect(Collectors.toList());
        filestListless50.forEach(e -> filestListless50Names.add(e.getName()));

        filestListless50Names.remove("allFilesContent.txt");

        List<String> filestListless50NamesSorted = filestListless50Names.stream().sorted(Comparator.naturalOrder()).distinct().collect(Collectors.toList());

        for (String fd : filestListless50NamesSorted) {
            for (File f : filestList) {
                if (f.getName().equals(fd) && f.length() <= 250) {
                    Scanner sc = new Scanner(f);
                    while (sc.hasNext()) {
                        outputStream.write(sc.next().getBytes());
                    }
                    outputStream.write(System.getProperty("line.separator").getBytes());
                }
            }
        }
        outputStream.close();
    }

}
