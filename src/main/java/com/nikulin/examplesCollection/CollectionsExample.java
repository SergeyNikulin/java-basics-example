package com.nikulin.examplesCollection;

import java.util.*;

public class CollectionsExample {

    public static void main(String[] args) {
        // Работа с Arrays
        int[] array = {3, 1, 5, 8, 6};
        System.out.println(Arrays.toString(array));

        // Сортировка массива
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        // Сравнение массивов
        int[] array2 = {3, 1, 5, 8, 6};
        System.out.println(Arrays.equals(array, array2));

        // Создание нового массива из части старого
        int[] array3 = Arrays.copyOfRange(array, 0, 3);
        System.out.println(Arrays.toString(array3));

        // Приведение массива в list
        System.out.println(Arrays.asList(array));

        System.out.println("============================================");

        // Работа с Collections
        List<String> items = new ArrayList<>();
        List<String> items2 = Collections.emptyList();
        List<String> items3 = Collections.singletonList("singleton");

        System.out.println(items);
        System.out.println(items2);
        System.out.println(items3);

        // Добавление одного элемента
        items.add("test1");
        items.add("test2");
        // Добавление нескольких элементов
        Collections.addAll(items, "test5", "test4", "test3");

        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + " ");
        }

        // Сортировка
        Collections.sort(items);

        System.out.println();

        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + " ");
        }

        // Обратная сортировка
        Collections.sort(items, Collections.reverseOrder());

        System.out.println();

        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + " ");
        }
    }
}
