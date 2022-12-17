package com.nikulin.examplesCollection;

import java.util.*;

public class MapsExample {

    public static void main(String[] args) {
        Map<Integer, String> aMap = new HashMap<>();

        // Проверка на пустоту
        System.out.println(aMap.isEmpty());

        // Размер
        System.out.println(aMap);
        System.out.println(aMap.size());

        // Добавление элементов
        aMap.put(1, "foo");
        aMap.put(3, "ger");
        aMap.put(2, "bar");
        System.out.println(aMap);

        // Найти по ключу значение
        System.out.println(aMap.get(2));

        // Проверка есть ли данный ключ
        System.out.println(aMap.containsKey(3));

        // Список всех ключей
        System.out.println(aMap.keySet());

        // Список всех значений
        System.out.println(aMap.values());

        // Список всех ключ + значений
        System.out.println(aMap.entrySet());

        // Сортировка по ключу через Array List
        List<Integer> employeeByKey = new ArrayList<>(aMap.keySet());
        Collections.sort(employeeByKey);
        System.out.println(employeeByKey);

        // Сортировка по значению через Array List
        List<String> employeeByValue = new ArrayList<>(aMap.values());
        Collections.sort(employeeByValue);
        System.out.println(employeeByValue);

        // Заменить значение по ключу
        aMap.replace(2,"tyy");
        System.out.println(aMap);

        // Удаление элемента по ключу
        aMap.remove(3);
        System.out.println(aMap);

        // Удаление всех элементов
        aMap.clear();
        System.out.println(aMap);
    }
}
