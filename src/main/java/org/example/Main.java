/*Задание:
• Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
• Создать множество ноутбуков.
• Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
Критерии фильтрации можно хранить в Map.
Например:
Шаг 1. “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Шаг 2. Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
• Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
*/

/*
1 - ID (артикул)
2 - Бренд
3 - Операционная система
4 - ОЗУ
5 - Объем ЖД
6 - Цвет
7 - Дисплей
8 - Цена
*/

package org.example;

import org.example.model.Laptops;

import java.util.*;

public class Main {
    public static <Search> void main(String[] args) {
        Laptops product1 = new Laptops(1, "Apple", "MacOS XV", 12, 4096, "серебристый", 12, 3000);
        Laptops product2 = new Laptops(2, "Lenovo", "Windows 11", 4, 256, "черный", 14, 700);
        Laptops product3 = new Laptops(3, "Asus", "Windows 10", 2, 512, "коричневый", 14, 650);
        Laptops product4 = new Laptops(4, "Hewlett-Packard", "Windows 10", 4, 1024, "белый", 15, 1000);
        Laptops product5 = new Laptops(5, "Sony", "Windows 10", 4, 2048, "розовый", 15, 1200);
        Laptops product6 = new Laptops(6, "Apple", "MacOS XV", 8, 1024, "серебристый", 14, 2000);
        Laptops product7 = new Laptops(7, "Lenovo", "Windows 10", 2, 512, "черный", 116, 1150);
        Laptops product8 = new Laptops(8, "Asus", "Windows 11", 8, 2048, "золотой", 13, 1050);
        Laptops product9 = new Laptops(9, "Hewlett-Packard", "Windows 11", 12, 2048, "серебристый", 16, 999);
        Laptops product10 = new Laptops(10, "Sony", "Windows 11", 8, 1024, "белый", 15, 1100);

        Set<Laptops> laptopSet = new HashSet<>();
        laptopSet.add(product1);
        laptopSet.add(product2);
        laptopSet.add(product3);
        laptopSet.add(product4);
        laptopSet.add(product5);
        laptopSet.add(product6);
        laptopSet.add(product7);
        laptopSet.add(product8);
        laptopSet.add(product9);
        laptopSet.add(product10);

        Map<Integer, String> criteria = new HashMap<>();
        criteria.put(0, "brand");
        criteria.put(1, "ram");
        criteria.put(2, "hard drive");
        criteria.put(3, "price");

        Map<Integer, String> brands = new HashMap<>();
        brands.put(0, "Apple");
        brands.put(1, "Lenovo");
        brands.put(2, "Asus");
        brands.put(3, "Hewlett-Packard");
        brands.put(4, "Sony");

        // Выбор критерия поиска
        Scanner scanner = new Scanner(System.in);
        System.out.print("0 - Бренд\n" +
                "1 - ОЗУ\n" +
                "2 - Объем ЖД\n" +
                "3 - Цена\n" +
                "Введите номер критерия поиска: ");
        int inputCriteria = scanner.nextInt();
        int inputCriteriaValue = -1;
        // Поиск по бренду
        if (criteria.get(inputCriteria) == criteria.get(0))
        {
            System.out.print("0 - Apple\n" +
                    "1 - Lenovo\n" +
                    "2 - Asus\n" +
                    "3 - Hewlett-Packard\n" +
                    "4 - Sony\n" +
                    "Введите код бренда: ");
            inputCriteriaValue = scanner.nextInt();
            for (var item : laptopSet)
            {
                if(item.getBrand() == brands.get(inputCriteriaValue))
                {
                    System.out.println(item);
                }
            }
        }
        // Поиск по ОЗУ
        else if (criteria.get(inputCriteria) == criteria.get(1))
        {
            System.out.print("Введите минимальный объем ОЗУ в Гб: ");
            inputCriteriaValue = scanner.nextInt();
            for (var item : laptopSet)
            {
                if(item.getRam() >= inputCriteriaValue)
                {
                    System.out.println(item);
                }
            }
        }
        // Поиск по объему ЖД
        else if (criteria.get(inputCriteria) == criteria.get(2))
        {
            System.out.print("Введите минимальный объем ЖД в Гб: ");
            inputCriteriaValue = scanner.nextInt();
            for (var item : laptopSet)
            {
                if(item.getHardDrive() >= inputCriteriaValue)
                {
                    System.out.println(item);
                }
            }
        }
        // Поиск по цене
        else if (criteria.get(inputCriteria) == criteria.get(3))
        {
            System.out.print("Цена от (в USD): ");
            inputCriteriaValue = scanner.nextInt();
            for (var item : laptopSet)
            {
                if(item.getPrice() >= inputCriteriaValue)
                {
                    System.out.println(item);
                }
            }
        }
        else System.out.println("Incorrect input!");
    }
}

