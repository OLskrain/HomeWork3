import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {
   private HashMap<String, ArrayList<String>> book; //Ключ у нас Фамилия, а в ArrayList складываем все номера, которые встречаются под этой фамилией

     Phonebook() {            //Конструктор, в котором создаем HasMap
       book = new HashMap<>();
    }
    public void add(String surname, String phone){
         if(!book.containsKey(surname)) {           //Проверяем есть ли такая фамилия, и если её нкт то создаем ArrayList
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(phone);                   //И кладум туда телефон
             book.put(surname, arrayList);          //В запись кладем текушую Фамилию и созданный Arraylist с номером
        }else book.get(surname).add(phone);         //Спрашиваем у текушего имени список номеров и ложим туда же номер ещё
    }
    public ArrayList<String> get(String surname){   //метод через который мы запрашиваем имя
        return book.get(surname);
    }
}