package com.epam.javar.tasks;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/*
Своя реализация
*/

public class Task3104FileWalker extends SimpleFileVisitor<Path> {

    private List<String> archived = new ArrayList<>();
    private List<String> failed = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        EnumSet<FileVisitOption> options = EnumSet.of(FileVisitOption.FOLLOW_LINKS);
        final Task3104FileWalker solution = new Task3104FileWalker();
        //     Files.walkFileTree(Paths.get("D:/"), options, 20, solution);
        Files.walkFileTree(Paths.get("D:/Penske/hos-6321/"), options, 20, solution);

        List<String> result = solution.getArchived();
        System.out.println("All archived files:");
        for (String path : result) {
            System.out.println("\t" + path);
        }

        List<String> failed = solution.getFailed();
        System.out.println("All failed files:");
        for (String path : failed) {
            System.out.println("\t" + path);
        }


    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (file.getFileName().endsWith(".rar")) archived.add(file.toString());
        if (file.getFileName().toString().substring(file.getFileName().toString().length() - 4).matches(".zip"));
            return super.visitFile(file, attrs);

    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        failed.add(file.toString());
        return FileVisitResult.SKIP_SUBTREE;
    }

    public List<String> getArchived() {
        return archived;
    }

    public List<String> getFailed() {
        return failed;
    }


}

