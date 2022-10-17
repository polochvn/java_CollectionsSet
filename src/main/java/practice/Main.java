package practice;

import java.awt.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    private static EmailList emailList = new EmailList();
    
    /* TODO:
        Пример вывода списка Email, после ввода команды LIST в консоль:
        test@test.com
        hello@mail.ru
        - каждый адрес с новой строки
        - список должен быть отсортирован по алфавиту
        - email в разных регистрах считается одинаковыми
           hello@skillbox.ru == HeLLO@SKILLbox.RU
        - вывод на печать должен быть в нижнем регистре
           hello@skillbox.ru
        Пример вывода сообщения об ошибке при неверном формате Email:
        "Неверный формат email"
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("0")) {
                break;
            }
            String command = "";
            String email = "";
            Pattern pattern = Pattern.compile("(ADD|LIST)\\s*([\\w|\\d]+@.+\\.\\w{2,})");
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                command = matcher.group(1);
                email = matcher.group(2);
            }
            switch (command) {
                case "ADD":
                    emailList.add(email);

                case "LIST":
                    emailList.getSortedEmails();
            }
            //TODO: write code here
        }
    }
}
