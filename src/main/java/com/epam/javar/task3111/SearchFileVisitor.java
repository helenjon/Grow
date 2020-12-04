package com.epam.javar.task3111;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.FileVisitResult.CONTINUE;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {

    private String partOfName = null;
    private String partOfContent = null;
    private int minSize = -1;
    private int maxSize = -1;
    private List<Path> foundFiles = new ArrayList<>();


    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        if ((partOfName == null || file.toString().contains(partOfName))
                && (partOfContent == null || fileContains(file, partOfContent))
                && (maxSize < 0 || file.toFile().length() < maxSize)
                && (minSize < 0 || file.toFile().length() > minSize)) {
            foundFiles.add(file);
        }

        return FileVisitResult.CONTINUE;
    }

    private  boolean fileContains(Path file, String partOfContent){

        Scanner sc = new Scanner(file.toString());
        while (sc.hasNext()){
            if (sc.next().contains(partOfContent)) return true;
        }
        return false;
    }


    public List<Path> getFoundFiles() {
        return foundFiles;
    }


    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }


    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
}

