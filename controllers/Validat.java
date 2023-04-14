package personal.controllers;

import personal.model.User;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validat {
    public void validate(User user) {
        if (!pattern.matcher(user.getFirstName()).find()) {
            throw new RuntimeException("Имя пользователя не может быть пустым");

        }
        if (!pattern.matcher(user.getLastName()).find()) {
            throw new RuntimeException("Фамилия пользователя не может быть пустым");
        }
        if (!patternDigit.matcher(user.getPhone()).find()) {
            throw new RuntimeException("Номер телефона пользователя не может быть пустым");
        }
    }
    final String regex = "^\\S+$";
    final String reDigit = "^\\d+$";
    final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
    final Pattern patternDigit = Pattern.compile((reDigit));

}