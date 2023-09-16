package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String[] products = new String[]{"Хлеб", "Яблоки", "Сок"};
            int[] prices = new int[]{30, 80, 100};
            int totalPrice = 0; // переменная для хранения общей стоимости покупок
            int[] basket = new int[products.length]; // массив для хранения количества каждого продукта в корзине

            System.out.println(Arrays.toString(products)); // вывод списка продуктов и цен на них
            System.out.println(Arrays.toString(prices)); // вывод списка продуктов и цен на них

            while (true) {
                System.out.println("Введите номер продукта и количество или введите end");
                String input = sc.nextLine();


                if ("end".equals(input)) {
                    System.out.println("Программа завершена");
                    break;
                }

                String[] inputPart = input.split(" "); // разбиваем строку на подстроки, используя пробел в качестве разделителя

                int productNumber = Integer.parseInt(inputPart[0]) - 1; // получаем индекс номера продукта (При выборе продукта под номером 1, индекс его будет 2, поэтому нужно - 1)
                int quantity = Integer.parseInt(inputPart[1]); // получаем количество из введенных пользователем в консоль

                basket[productNumber] = basket[productNumber] + quantity; // Этот код добавляет выбранный продукт в корзину и увеличивает количество этого продукта в корзине на указанное пользователем количество. Для этого используется массив "basket", который хранит информацию о товарах в корзине. Индекс выбранного продукта в массиве "basket" задается переменной "productNumber". Чтобы добавить выбранный продукт в корзину, нужно увеличить его количество в массиве "basket". Для этого используется оператор "+=", который добавляет к текущему значению элемента массива (количество выбранного продукта) значение переменной "quantity" (количество, которое пользователь хочет добавить в корзину). Таким образом, после выполнения кода, количество выбранного продукта в корзине будет увеличено на указанное пользователем количество.
                totalPrice += prices[productNumber] * quantity;
            }

            System.out.println("Список покупок");
            for (int i = 0; i < products.length; i++) {
                System.out.println(products[i] + " - " + basket[i] + " x $" + prices[i] + " = $" + (prices[i] * basket[i]));
            }

            System.out.println("Итого - " + totalPrice);
        }catch (NumberFormatException e){
            System.out.println("Введите целое число");
        }
    }
}

















//        Scanner scanner = new Scanner(System.in);
//        int[] prices = new int[]{100, 200, 300};
//        String[] products = new String[]{"Хлеб", "Яблоки", "Молоко"};
//        System.out.println(Arrays.toString(products));
//        System.out.println(Arrays.toString(prices));
//        int currentPrice = 0;
//        int[] basket = new int[3];
//        while (true) {
//            System.out.print("Введите номер продукта: ");
//            String userProduct = scanner.nextLine();
//            if ("end".equals(userProduct)) {
//                break;
//            }
//            System.out.print("Введите количество: ");
//            int amount = scanner.nextInt();
//            int userNumberProduct = Integer.parseInt(userProduct);
//            currentPrice = currentPrice + (prices[userNumberProduct - 1] * amount);
//            scanner.nextLine();
//            basket[userNumberProduct - 1] = basket[userNumberProduct - 1] + amount;
//        }
//        for (int i = 0; i < 3; i++) {
//            System.out.println("продукт " + products[i]);
//            System.out.println("количество " + basket[i]);
//            int priceOfproduct = basket[i] * prices[i];
//            System.out.println("стоимость " + priceOfproduct);
//        }
//        System.out.println("общая цена " + currentPrice);
//        scanner.close();
//    }



