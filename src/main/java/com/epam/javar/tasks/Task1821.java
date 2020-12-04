package com.epam.javar.tasks;

//Программа запускается с одним параметром - именем файла, который содержит английский текст.
//        Посчитать частоту встречания каждого символа.
//        Отсортировать результат по возрастанию кода ASCII (почитать в инете).
//
//        Пример:
//        ','=44, 's'=115, 't'=116.
//
//        Вывести на консоль отсортированный результат:
//        [символ1] частота1
//        [символ2] частота2

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Map.Entry.comparingByKey;

public class Task1821 {
    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> mapp = new HashMap<>();
        // read from the file and collect values into the mapp;
        try (Stream<String> stream = Files.lines(Paths.get("src/main/resources/task1821.txt"))) {
            stream.forEach(x -> {
                IntStream intStream = x.chars();
                intStream.sorted().forEach(y -> {
                            if (mapp.get(y) != null) {
                                mapp.put(y, mapp.get(y) + 1);
                            } else {
                                mapp.put(y, 1);
                            }
                        }
                );
            });
            //print from mapp sorted result
            mapp.entrySet().stream()
                    .sorted(comparingByKey())
                    .forEach(x -> {
                        System.out.print(Character.toChars(x.getKey()));
                        System.out.print("=");
                        System.out.print(x.getValue());
                        System.out.println();
                    });
        }
    }
}
