package com.nikulin.examplesCollection;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetsExample {

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();

        // Проверка на пустоту
        System.out.println(stringSet.isEmpty());

        // Размер
        System.out.println(stringSet);
        System.out.println(stringSet.size());

        // Добавление элементов
        stringSet.add("test1");
        stringSet.add("test2");
        stringSet.addAll(List.of("test5", "test4", "test3"));
        stringSet.add("test2");
        System.out.println(stringSet);
        System.out.println(stringSet.size());

        // Не добавляет если, уже есть такой элемент
        stringSet.add("test2");
        System.out.println(stringSet);

        // Проверка на вхождение коллекции
        System.out.println(stringSet.containsAll(List.of("test5", "test4")));

        // Удаление элемента по значению
        stringSet.remove("test3");
        System.out.println(stringSet);
    }
}
