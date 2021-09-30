package HomeWork_10;

//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и
//вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
//Посчитать, сколько раз встречается каждое слово.

import java.sql.Struct;
import java.util.*;

public class HomeWork_10 {
    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        list.addAll(List.of("Mercedes","Kia","Hyundai","Bmw","Volkswagen","Kia","Skoda","Bmw","Audi",
                                "Seat", "Nissan","Toyota", "Ford","Renault","Nissan", "Bmw"));

        System.out.println(list); //перечень объектов в списке
        System.out.println(list.size()); //колличество объектов в списке(всего)
        Set set = new HashSet();
        set.addAll(list);
        System.out.println("Список уникальный слов: " + set);
        System.out.println("Количество объектов: " + set.size());
        System.out.println(list.size() - set.size());



    }
}


