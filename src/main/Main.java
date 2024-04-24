package main;

public class Main {
    public static void main(String[] args) {
        System.out.println( findPercent(100, 15));
        /*
        Маша Авдалимова.
        Написать метод, который принимает строку и
        оставляет в ней только буквы и числа,
        удаляя все остальное.
        Возвращает получившуюся строку.
         */

        /*
        Маша Стрельмах.
        Написать метод для
        обработки кода, который получает два списка целых,
        заполненных случайными числами.
        Код формирует и возвращает новый список,
        содержащий элементы обоих списков без повторений.
         */

        /*
        Савченко Захар.
        Написать метод для
        обработки кода,
        который содержит один аргумент –
        строку и распечатать количество букв и цифр в ней.
         */

        /*
        Роман.
        Написать метод, который работает со списком целых, заполненных случайными числами.
        Вам нужно сформировать и распечатать из нового списка:
        1) Минимальный элемент
        2) Максимальный элемент
        3) Число отрицательных элементов
        4) Число положительных элементов
        5) Число нулей
         */

        /*
        Артём.
        Написать метод,
        который принимает два целочисленных аргумента,
        где первое число — это значение,
        второе число процент,
        который необходимо посчитать и
        вернуть как результат выполнения функции.
        Например, аргументами будут числа 1000 и 10,
        то результатом выполнения функции будет 100
        (10 процентов от 1000).
         */

        /*
        Саша.
        Создать метод, который принимает три аргумента:
        два числа и действие над ними.
        В случае, если действие над числами не поддерживается,
        вернуть «операция не поддерживается».
         */

        /*
        Сёма.
        Написать функцию, которая вычисляет площадь круга.
         */

        /*
        Егор.
        Написать метод, принимающий целое число.
        Метод проверяет, положительное ли оно,
        отрицательное или равно нулю
        и выводит соответствующее сообщение.
         */

        /*
        Миша.
        Написать метод, который принимает один аргумент –
        целое двухзначное число
        и выводит в консоль каждый его разряд
        на разных строках, а возвращает их сумму.
         */

        /*
        Кирил.
        Написать метод, принимающий два целых числа.
        Метод проверяет, равны ли они и, если они не равны,
        то вывести их в порядке возрастания.
        Если равны, то вернуть True.
         */

        /*
        Николоз.
        Написать метод, который принимает два целых числа (границы диапазона),
        формирует список из чисел этого диапазона (включая границы)
        и возвращает сформировавшийся список.
         */

        /*
        Селевёстров Захар.
        Решить следующую задачу с применением метода:
        Зарплата менеджера составляет 200$ + процент от продаж,
        продажи до 500$ — 3%,
        от 500 до 1000 — 5%,
        свыше 1000 — 8%.
        Метод принимает три аргумента,
        обозначающих уровень продаж для трех менеджеров.
        Определить их зарплату,
        определить лучшего менеджера,
        начислить ему премию 200$,
        вывести итоги в консоль.
         */

        /*
        Илья.
        Написать метод, который вычисляет площадь и периметр квадрата.
         */
    }

    public static int findPercent(int num, int percent) {
        return num * percent / 100;
    }
}
