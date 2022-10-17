package practice;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {

    TreeSet<String> emailList = new TreeSet<>();

    public void add(String email) {

        String regex = "[\\w|\\d]+@.+\\.\\w{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (!emailList.contains(email) && matcher.find()) {
            System.out.println(emailList.add(email.toLowerCase()));
        } else {
            System.out.println(Main.WRONG_EMAIL_ANSWER);
        }
        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        // принять решение добавлять аргумент email или нет должен этот метод
    }

    public List<String> getSortedEmails() {
        for (String list: emailList) {
            System.out.println(list);
        }
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
        return new ArrayList<>(emailList);
    }

}
