import java.util.*;

/**
 * Javacore 1. Homework 3.
 * @author Andrey Ievlev.
 * @version Jan 28, 2018
 * @Link https://github.com/OLskrain/HomeWork3.git
 */

//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
// из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.
//2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона
// по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны.
public class HM3 {
    public static void main(String[] args) {
        //Task 1
        String[] strings = {"A", "B", "C", "C", "S","B","R"};
        HashMap<String,Integer> hm = new HashMap<>(); //1 значение String - ключ(Фамилия), 2 - Integer - сколько раз встречалось раз(Фамилия)
        for (String string: strings) {
            if(!hm.containsKey(string)){              //Если нам небыло такого слова, то..
                hm.put(string,1);                     //Записываем в HahMap что слово было 1 раз
            }else hm.put(string, hm.get(string)+1);   //перезаписываем слово и спрашиваем цифру(сколько раз встречалось) и +1
        }
        System.out.println(hm);

        //Task2

        Phonebook phonebook = new Phonebook();
        phonebook.add("Ievlev", "89111612999");
        phonebook.add("Ievlev", "89999999999");
        phonebook.add("Kowolev", "89166662999");
        phonebook.add("Inkov", "89213344555");
        phonebook.add("Kotov", "8921334666");
        phonebook.add("Kotov", "8921476555");
        phonebook.add("Kotov", "89437944555");

        System.out.println(phonebook.get("Ievlev"));
        System.out.println(phonebook.get("Kotov"));
        System.out.println(phonebook.get("Inkov"));

}
}
