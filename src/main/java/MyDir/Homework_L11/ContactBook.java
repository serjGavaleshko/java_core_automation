package Homework_L11;

//Написать приложение “Телефонная книга”
//        + В телефонной книге есть категории имен, которые задает пользователь
//        + При первом запуске нет ни одной категории имен
//        + Пользователь может менять имена или телефоны для каждой записи
//        + Когда пользователь запускает программу - ему выводится список категорий
//        + Если пользователь введет имя существующей категории - ему выводится список имен и телефонов из категории
//        -- Если пользователь вводит имя новой категории - открывается новая категория
//        В любой категории пользователь должен иметь возможность
//        - изменить имя существующей записи,
//        - изменить номер существующей записи или
//        - добавить новую запись
//        + Каждое имя может иметь один телефонный номер


import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ContactBook {

    private static String name() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Name, Surname: ");
        return in.nextLine();
    }

    private static String phoneNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Phone Number: ");
        return in.nextLine();
    }

    private static String categoryName() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Category Name: ");
        return in.nextLine().toUpperCase();
    }

    public void contactListRunner() {

        HashMap<String, String> categoryMap = new HashMap<>();
        HashMap<String, String> contactMap = new HashMap<>();
        System.out.println("Best contact List ever 2027");


        while (true) {

            System.out.println();

            HashSet<String> catList = new HashSet<String>();
            categoryMap.forEach((k, v) -> catList.add(v));
            System.out.println("Categories are: " + catList);
            System.out.println("To add new contact type (put), To display all contacts type (prcon) To show all category type(showCat) to change Phone type (changePhone)");

            Scanner in = new Scanner(System.in);
            String operation = in.nextLine();

            switch (operation) {
                case "put":


                    String name = name();
                    String phoneNumber = phoneNumber();
                    String category = categoryName();

                    contactMap.putIfAbsent(name, phoneNumber);

                    categoryMap.putIfAbsent(name, category);
                    break;

                case "prcon":

                    String findName = name();

                    boolean containCheck = contactMap.containsKey(findName);
                    if (containCheck) {
                        System.out.println(" Category: " + categoryMap.get(findName) + " Telephone: " + contactMap.get(findName) + " Name: " + findName);
                    }
                    break;

                case "changePhone":

                    System.out.println("Change Phone by Name ");
                    findName = name();
                    String newPhone = phoneNumber();

                    if (contactMap.containsKey(findName)) {
                        contactMap.put(findName, newPhone);

                    } else System.out.println("Wrong input");


                    System.out.println(" Category: " + categoryMap.get(findName) + " Telephone: " + contactMap.get(findName) + " Name: " + findName);

                    break;

                case "category":
                    category = categoryName();
                    if (!catList.contains(category)) {
                        categoryMap.put(null, category);

                    }else System.out.println("Category name is already exists");
                    break;

                default:

                    System.out.println("Wrong input");

                    break;

            }
        }
    }
}
