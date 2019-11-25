package Homework_L11;

//Написать приложение “Телефонная книга”
//        В телефонной книге есть категории имен, которые задает пользователь
//        При первом запуске нет ни одной категории имен
//        Пользователь может менять имена или телефоны для каждой записи
//        Когда пользователь запускает программу - ему выводится список категорий
//        Если пользователь введет имя существующей категории - ему выводится список имен и телефонов из категории
//        Если пользователь вводит имя новой категории - открывается новая категория
//        В любой категории пользователь должен иметь возможность
//        изменить имя существующей записи,
//        изменить номер существующей записи или
//        добавить новую запись
//        Каждое имя может иметь один телефонный номер

import java.util.HashMap;
import java.util.Scanner;

public class ContactBook {

    private static String name() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Name   ");
        return in.nextLine();
    }

    private static String phoneNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Phone Number   ");
        return in.nextLine();
    }
    private static String categoryName() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Category Name   ");
        return in.nextLine();
    }

    public void contactListRunner() {

        HashMap<String, String> categoryMap = new HashMap<>();
        HashMap<String, String> contactMap = new HashMap<>();


        while (true) {

            System.out.println("To add new contact type (putC) To add New category type(addCat)");
            Scanner in = new Scanner(System.in);
            String oper = in.nextLine();

            if (oper.equals("putC")) {
                String name = name();
                String phoneNumber = phoneNumber();
                String category = categoryName();

                contactMap.putIfAbsent(name, phoneNumber);

                categoryMap.putIfAbsent(category, contactMap.get(name));

                System.out.println("putC" + categoryMap);

            } else if (oper.equals("prC")) {

                System.out.println(categoryMap.get("Work"));
                System.out.println("prC" + categoryMap);

            }
        }
    }
    public void categoryAdder(){



    }
}
