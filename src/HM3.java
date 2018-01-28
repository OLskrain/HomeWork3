import java.util.ArrayList;
import java.util.*;


/**
 * Javacore 1. Homework 3.
 * @author Andrey Ievlev.
 * @version Jan 28, 2018
 * @Link
 */

public class HM3 {

    public static void main(String[] args) {

        //Task 1
        LinkedHashMap<String, Integer> unique_list = new LinkedHashMap<>();
        ArrayList<String> list_class = new ArrayList<>();
        list_class.add("Masha");
        list_class.add("Dasha");
        list_class.add("Masha");
        list_class.add("Boris");
        list_class.add("Pasha");
        list_class.add("Andrey");
        list_class.add("Sasha");
        list_class.add("Pasha");
        list_class.add("Masha");
        list_class.add("Dima");
        list_class.add("Roma");

        for (int i = 0; i < list_class.size(); i++) {
            int count = Collections.frequency(list_class, list_class.get(i));
            unique_list.put(list_class.get(i),count);
            }

            System.out.println("Список уникальных имен: " + unique_list.keySet());
            System.out.println();

        Set<Map.Entry<String,Integer>> set = unique_list.entrySet();
        for(Map.Entry<String,Integer> o: set){
            System.out.println("Имя " + o.getKey() + " встречается " + o.getValue()+ " раз.");
        }
        System.out.println("================================");

        //Task2
        Phonebook phonebook = new Phonebook();

        phonebook.add("Ievlev", "89111612999");
        phonebook.add("Ievlev", "89999999999");
        phonebook.add("Kowolev", "89166662999");
        phonebook.add("Inkov", "89213344555");
        phonebook.add("Kotov", "8921334666");
        phonebook.add("Yanin", "8921476555");
        phonebook.add("Arbyzov", "89437944555");

        phonebook.printAll();
        phonebook.searchNumber("poi");


}
}
