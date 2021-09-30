package HomeWork_10;

//2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
//телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять
//записи, а с помощью метода get() искать номер телефона по фамилии. Следует учесть, что под
//одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе
//такой фамилии должны выводиться все телефоны. Желательно не добавлять лишний функционал
//(дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем через консоль
//и т.д). Консоль использовать только для вывода результатов проверки телефонного
//справочника.

import java.util.*;

public class  HW_10_PhoneBook{

    private final Map<String, Set<String>> entries = new HashMap<>();

    public void add(String name, String phonenumber){
        Set<String> phones = getPhones(name);
        phones.add(phonenumber);
    }

    private Set<String> getPhones(String name){
        return entries.computeIfAbsent(name, k->new HashSet<>());
    }


    public static void main(String[] args){

    HW_10_PhoneBook phoneBook = new HW_10_PhoneBook();
    phoneBook.add("Ivanov", "50049");
    phoneBook.add("Petrov", "52056");
    phoneBook.add("Sidorov", "53638");
    phoneBook.add("Prigojin", "50014");
    phoneBook.add("Sorokin", "50660");
    phoneBook.add("Fedorov", "50208");
    phoneBook.add("Petrov", "50208");

    System.out.println(phoneBook.entries);




    }
}
