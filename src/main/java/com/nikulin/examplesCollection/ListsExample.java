package com.nikulin.examplesCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListsExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Проверка на пустоту
        System.out.println(list.isEmpty());

        // Размер
        System.out.println(list);
        System.out.println(list.size());

        // Добавление элементов
        list.add("test1");
        list.add("test2");
        list.addAll(List.of("test5", "test4", "test3"));
        list.add(5, "test6");
        System.out.println(list);
        System.out.println(list.size());

        // Нахождения индекса элемента
        System.out.println(list.indexOf("test2"));

        // Проверка на вхождение коллекции
        System.out.println(list.containsAll(List.of("test5", "test4")));

        // Получить подлист из текущего
        List<String> list2 = list.subList(2,6);
        System.out.println(list2);

        // Удаление элемента по индексу
        list.remove(1);
        System.out.println(list);

        // Удаление элемента по значению
        list.remove("test4");
        System.out.println(list);

        // Сделать массив на основе листа
        String[] array = list.toArray(new String[0]);
        System.out.println(array);
        System.out.println(Arrays.toString(array));

        // Сортировка
        Collections.sort(list);
        System.out.println(list);
    }
}
